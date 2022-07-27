import java.io.*;
import java.util.*;

public class Main {
    static String str;
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            str = br.readLine();

            if (str.equals(".")) break;

            System.out.println(input());
        }
    }

    static String input() throws IOException {

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == '[' || c == '(') stk.push(c);

            else if (c == ']') {  // pop의 조건 짝을 지을 괄호가 존재하는지, 그 사이에 있는 문자열도 군형이 잡혔는지
                if (stk.empty() || stk.peek() != '[') {
                    return "no";
                } else {
                    stk.pop();
                }
            }
            
            else if (c == ')') {
                if (stk.empty() || stk.peek() != '(') {
                    return "no";
                } else {
                    stk.pop();
                }
            }
        }
        if (stk.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}