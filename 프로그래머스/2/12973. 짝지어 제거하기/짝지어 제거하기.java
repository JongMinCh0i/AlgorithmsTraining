import java.io.*;
import java.util.*;

class Solution {
    
    private static final int SUCCESS = 1;
    private static final int FAIL = 0;
    
    public int solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
            
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(!stack.isEmpty() && stack.peek().equals(ch)) {
                stack.pop();
            }else{
                stack.push(ch);                
            }
          
        }
        
        if(stack.isEmpty()) {
            return SUCCESS;
        }

        return FAIL;
    }
}   