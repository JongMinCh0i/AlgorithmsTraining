import java.util.*;

class Solution {
    public static Stack<Character> stk = new Stack<>();

    public int solution(String s) {
        char[] chArr = s.toCharArray();
        
        for(int i = 0; i < chArr.length; i++) {
            char ch = chArr[i];
            
            if(!stk.isEmpty() && stk.peek() == ch) {
                stk.pop();
            } else {
                stk.push(ch);
            }
    
        }
        
        return stk.isEmpty() ? 1 : 0;
    }
}