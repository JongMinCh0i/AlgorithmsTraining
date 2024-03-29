import java.util.*;
import java.io.*;

class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            if( arr[i] % divisor == 0) {
                answer.add(arr[i]);
            } 
        }
        
        if(answer.size() == 0) {
            answer.add(-1);
        }
        
        return answer;
    }
}