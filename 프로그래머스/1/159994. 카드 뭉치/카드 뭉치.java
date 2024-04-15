import java.util.*;

class Solution {
    
    public static int cnt = 0;
    public static Stack<String> card1 = new Stack<>();
    public static Stack<String> card2 = new Stack<>();
    
    public void init(String[] cards1, String[] cards2) {
        
        for(int i = cards1.length - 1; i >= 0; i--) {
            card1.push(cards1[i]);
        }
        
        for(int i = cards2.length - 1; i >= 0; i--) {
            card2.push(cards2[i]);
        }
    }
    
    public Boolean logic(String[] goal) {
        
        for(int i = 0; i < goal.length; i++) {
            String cand = goal[i];

            if(!card1.isEmpty() && card1.peek().equals(cand)) {
                card1.pop();
                cnt++;
            } else if(!card2.isEmpty() && card2.peek().equals(cand)) {
                card2.pop();
                cnt++;
            }
        }
        
        return cnt == goal.length ? true : false;
    }
    
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        init(cards1, cards2);
        return logic(goal) ? "Yes" : "No";
    }
}