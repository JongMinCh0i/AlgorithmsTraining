/*
응급도를 [3, 76, 24] 순으로 입력 받으면 
응급도가 급한 인덱스를 배열에 추가해서 리턴한다. 

return [3,1,2] 
*/

import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sorted = emergency.clone();
        
        Arrays.sort(sorted); // 3,76,24 -> 3, 24, 76
        
        for(int i = 0; i < sorted.length; i++) {
            int number = emergency[i];
            for(int j = sorted.length - 1; j > 0; j--){ 
                if(number == sorted[j]) {
                    int ans = sorted.length - j;
                    
                    answer[i] = ans;    
                    }    
                }
            }
    
          for(int i = 0; i < sorted.length; i++) {
              if(answer[i] == 0) {
                  answer[i] = sorted.length;
              }
            
          }
        
          return answer;
    }
}