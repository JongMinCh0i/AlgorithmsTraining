
import java.io.*;
import java.util.*;
class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        boolean answer = false;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')' && stack.isEmpty()) {
                return false;
            } 
            
            
            if(s.charAt(i) == ')' && !stack.isEmpty()) {
                if(stack.peek().equals('(')){
                    stack.pop();
                }
            } 
            
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } 
        }
        
        if(stack.isEmpty()){
            answer = true; 
        } 
        

        return answer;
    }
}