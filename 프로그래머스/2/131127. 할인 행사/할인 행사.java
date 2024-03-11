import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> wantMap = new HashMap<>(); 
        for(int i = 0; i < want.length; i++) wantMap.put(want[i],number[i]);
        
        int answer = 0;
        
        // 전체 배열 순회
        for(int i = 0; i < discount.length - 9; i++) {

            HashMap<String, Integer> discountMap = new HashMap<>();
        
            // 그 중 10개씩 전진 
            for(int j = i; j < i + 10; j++) {
                if(wantMap.containsKey(discount[j])) {
                    discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
                }
            }

            // 같으면 answer++ 아니면 
            if(wantMap.equals(discountMap)) answer++;
        }
    
        return answer;
    }
}

// map<String, Integer> // 과일 이름, 과일 인덱스

/*
    chicken = 0
    apple = 1,2,5,12
    banana = 3,7,11,13
    rice = 4,9
    pork = 6,8
    pot = 10
*/
