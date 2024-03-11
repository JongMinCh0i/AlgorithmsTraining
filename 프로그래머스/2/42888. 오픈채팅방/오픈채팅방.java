/*
떠오르는 풀이 

1. HashMap<String, String> , UUID, 원래 들어올 때 이름
2. Leave 이후에 재 접속할 때 이름을 변경 가능 : 이 때 지금 까지 들어왔을 때의 이름 변경
3. Change UUID Name 일 때도 지금 까지의 이름 다 변경
4. 모든 것이 끝날 때 출력!
*/

import java.util.*;
import java.io.*;

class Solution {
    
    public String[] solution(String[] record) {
    
        HashMap<String, String> uuid = new HashMap<>();
        
        for(int i = 0; i < record.length; i++) {
            String str = record[i];
            StringTokenizer st = new StringTokenizer(str);
            String findSignal = st.nextToken();
            
            if(findSignal.equals("Enter") || findSignal.equals("Change")) {
                uuid.put(st.nextToken(), st.nextToken());
            }
        }
        
        // 답을 저장할 ArrayList
        ArrayList<String> answer = new ArrayList<>();
        int cnt = 0;
        
        for(int i = 0; i < record.length; i++) {
            String str = record[i];
            StringTokenizer st = new StringTokenizer(str);
            String signal = st.nextToken();

            if(signal.equals("Enter")) {
                String nickName = uuid.get(st.nextToken());
                answer.add(nickName + "님이 들어왔습니다.");
            }
            
            if(signal.equals("Leave")) {
                String nickName = uuid.get(st.nextToken());
                answer.add(nickName + "님이 나갔습니다.");
            }
        }
        
        return answer.toArray(new String[0]);
    }
}