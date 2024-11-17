import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        // numbers.length를 돌면서 i 값은 늘 다음 인덱스를 가리킨다.
        for(int i = 0; i < numbers.length; i++) {
            int num1 = numbers[i];            
            
            for(int j = i + 1; j < numbers.length; j++) {
                int num2 = numbers[j];
                list.add(num1 + num2);
           }
        }
        
        // list의 size만큼 돌면서 해당 값들을 set 자료구조에 더한다.
        for(int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        
        // 중복이 제거된 set의 길이 만큼 정수형 배열을 선언한다.
        int[] answer = new int[set.size()];
        
        // 이를 직접 하나씩 돌면서 위에 선언한 정수형 배열에 값을 넣고 반환한다.
        Iterator<Integer> iterator = set.iterator();
        for(int i = 0; i < set.size(); i++) {
            answer[i] = iterator.next();
        }

        
        Arrays.sort(answer);
        
        return answer;
    }
}
