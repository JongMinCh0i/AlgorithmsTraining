import java.io.*;
import java.util.*;

class Solution {

    private static final String OUT = "Z";

    public int solution(String s) {
        ArrayDeque<String> stack = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(s," ");

        while(st.hasMoreTokens()) {
            String ch = st.nextToken();

            if(ch.equals(OUT)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        System.out.println(stack);
        return stack.stream().mapToInt(Integer::valueOf).sum();
    }
}
