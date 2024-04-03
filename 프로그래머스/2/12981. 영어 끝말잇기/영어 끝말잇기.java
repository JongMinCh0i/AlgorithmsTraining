/*
    result 에서 words의 길이 만큼 사람, 카운팅(말한 횟수)카운팅
    만약 이미 words 에 있는 값을 말할 경우 && 끝말잇기 조건에 맞지 않을 경우 Stop
*/

import java.util.*;

class Solution {
    
    public int[] solution(int n, String[] words) { // 3,3
        Set<String> set = new HashSet<>();
        set.add(words[0]); // 이거 빼 먹었었음 

        for(int i = 1; i < words.length; i++) {
            
            // 현재 참가자와 단어의 순서 차이 왜 ? % 인지 나는 / 사용했었음

            int human = (i % n) + 1;
            int word = (i / n) + 1;
            
            char lastChar = words[i - 1].charAt(words[i - 1].length() - 1); // 첫문장의 마지막 글자 
            char firstChar = words[i].charAt(0); // 마지막 문장의 첫번째 글자
            
            if (set.contains(words[i]) || lastChar != firstChar) {
                return new int[] { human, word };
            }
            
            set.add(words[i]);
        }

        return new int[]{0,0};
    }
}
