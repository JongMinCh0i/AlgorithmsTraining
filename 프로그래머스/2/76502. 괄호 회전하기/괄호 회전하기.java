import java.util.*;

class Solution {
    public static int solution(String s) {
        
        HashMap<Character, Character> map = new HashMap<>(); 
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        
        int n = s.length();
        s += s;
        int cnt = 0;
        
        A:for(int i = 0; i < n; i++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
                        
            for(int j = i; j < i + n; j++) {
                char ch = s.charAt(j);
                
                if(!map.containsKey(ch)) {
                    stack.push(ch);
                }
                else { 
                    if(stack.isEmpty() || !stack.pop().equals(map.get(ch))) 
                        continue A;
                }
            }
                if(stack.isEmpty()) cnt++;  
        }
        return cnt;
    }
}