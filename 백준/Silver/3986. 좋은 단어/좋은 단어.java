import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int T, cnt;
    static Stack<Character> stk;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            input();
        }
        System.out.println(cnt);
    }

    static void input() throws IOException {
        stk = new Stack<>();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (stk.empty()) {
                stk.push(ch);
            } else {
                if (stk.peek() == ch) {
                    stk.pop();
                } else {
                    stk.push(ch);
                }
            }
        }
        if (stk.empty()) {
            cnt++;
        } stk.clear();

    }
}