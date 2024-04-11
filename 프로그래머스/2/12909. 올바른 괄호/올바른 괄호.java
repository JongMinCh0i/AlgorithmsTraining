import java.util.*;

class Solution {
    
    static Stack<Character> stk = new Stack<>();
    
    boolean solution(String s) {
        
        char[] ch = s.toCharArray();
        
        if(ch[0] == (')')) return false;
        
        for(int i = 0; i < ch.length; i++) {
            
            if(ch[i] == ('(')) {
                stk.push(ch[i]);
            }
            
            if(ch[i] == (')')) {
                if(stk.isEmpty()) {
                    return false;
                }
                stk.pop();
            }
        }
        
        return stk.isEmpty(); 
    }
}