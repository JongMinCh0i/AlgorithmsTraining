import java.io.*;
import java.util.*;

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String st = String.valueOf(n); // "118372"
                
        Long[] arr = new Long[st.length()]; 
        
        for(int i = 0; i < st.length(); i++) {
            arr[i] = Long.parseLong(String.valueOf(st.charAt(i)));
        }
    
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(long value : arr) {
            sb.append(value);
        }
        
        return Long.parseLong(sb.toString());
    }
}