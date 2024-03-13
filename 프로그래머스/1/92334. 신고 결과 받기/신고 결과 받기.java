/*
    풀이 1. 각 유저는 1번에 1명의 유저 신고 가능
        신고 횟수에 제한 X 서로 다른 유저를 계속 신고 가능
        
    풀이 2. k 번 이상 신고된 유저 정지, 이때 이 유저를 신고했던
        모든 유저에게 정지 메일(유저가 신고한 모든 내용을 취합)이 발송 됨
        한 명이 여러번 신고해도 한 번으로 카운팅
    
    풀이 3. 신고가 되서 정지당할 경우, 해당 유저를 신고했던 유저에게 메일이 발송
    
    풀이 4. 이 때 각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 return;
*/

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // 사람이 누구를 신고했는지 보여주는 리스트 : 신고 한 사람은 자기가 누굴 신고했는지가 중요!! <사람, 신고한 사람 들>
        Map<String, Set<String>> reportHashMap = new HashMap<>();
    
        // 사람이 신고 받은 횟수 카운팅 : 받은 사람은 자기가 k 이상인 것만 중요!  <사람, 신고 받은 횟수>
        Map<String, Integer> reportCountHashMap = new HashMap<>();
           
        // 신고한 사람이 본인과 신고한 사람들 내역 저장
        for(int i = 0; i< report.length; i++) {
            String str = report[i];
            StringTokenizer st = new StringTokenizer(str);
            String reporter = st.nextToken();
            String suspect = st.nextToken();
            
            if(!reportHashMap.containsKey(suspect)) {            
                reportHashMap.put(suspect, new HashSet<>()); 
            }
            
            // 내가 누굴 신고 했는지 이름을 저장
            reportHashMap.get(suspect).add(reporter);
        }
        
        for(Map.Entry<String, Set<String>> entry : reportHashMap.entrySet()) {
            if(entry.getValue().size() >= k) {
                for(String uid : entry.getValue()) {
                    reportCountHashMap.put(uid, reportCountHashMap.getOrDefault(uid, 0) + 1);
                }
            }
        }
        
        int[] answer = new int[id_list.length];
  
       for(int i = 0; i < id_list.length; i++) {
           answer[i] = reportCountHashMap.getOrDefault(id_list[i], 0);
       }
        
        
        return answer;
    }
}

