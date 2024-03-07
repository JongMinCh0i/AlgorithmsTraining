import java.io.*;
import java.util.*;

class Solution {
    
    private static ArrayDeque<String> of(String[] cards){
        ArrayDeque<String> stk = new ArrayDeque<String>();
        
        for(int i = cards.length - 1; i >= 0; i--) {
            stk.push(cards[i]);
        }

        return stk;
    }
    
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> cardStk1 = Solution.of(cards1);
        ArrayDeque<String> cardStk2 = Solution.of(cards2);
        String[] answer = new String[goal.length];
        // cardStk1의 길이가 10  cardStk2의 길이가 10 goal의 길이가 5 일수도 있음
        
        for(int i = 0; i < goal.length; i++) {
            if(!cardStk1.isEmpty() && goal[i].equals(cardStk1.peek())) {
                answer[i] = cardStk1.peek();
                cardStk1.pop();
                
            } else if(!cardStk2.isEmpty() && goal[i].equals(cardStk2.peek())) {
                answer[i] = cardStk2.peek();
                cardStk2.pop();
            }
        }
        
       return (Arrays.equals(answer, goal)) ? "Yes" : "No";
    }
}