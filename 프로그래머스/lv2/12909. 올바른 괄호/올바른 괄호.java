import java.io.*;
import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stk = new Stack<>();
        
        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == '(') stk.push(ch);
            
            if(ch == ')') {
                if(stk.empty() || stk.peek() != '(') {
                    return false;
                } else {
                    stk.pop();
                }
            }   
        }
        
        if(!stk.empty()) 
            return false;

        return true;
    }
}