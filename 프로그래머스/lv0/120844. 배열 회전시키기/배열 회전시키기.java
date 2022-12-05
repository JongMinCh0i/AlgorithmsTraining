import java.io.*;
import java.util.*;

class Solution {
    
    static Deque<Integer> queue = new ArrayDeque<>();
    
    public int[] solution(int[] numbers, String direction) {
        for(int i = 0; i < numbers.length; i++) {queue.add(numbers[i]);}

        int[] answer = new int[numbers.length];
    
        if(direction.equals("left")) {
             queue.add(queue.poll());
             for(int i = 0; i< numbers.length; i++) {
                 answer[i] = queue.poll();
             }
            return answer;
        } 
        
        if(direction.equals("right")) {    
               queue.offerFirst(queue.removeLast());
                 for(int i = 0; i< numbers.length; i++) {
                 answer[i] = queue.poll();
             }
            return answer;
        }
        
        return answer;
    }
}