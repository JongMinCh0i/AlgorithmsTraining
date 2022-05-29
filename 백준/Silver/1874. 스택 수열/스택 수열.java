import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] answer = new int[N];
        Stack<Integer> stk = new Stack<>(); // stk의 존재이유?

        for (int i = 0; i < N; i ++) {
            answer[i] = sc.nextInt();
        }
        
        int num = 1;
        StringBuffer sb = new StringBuffer();
        boolean result = true;

        for (int i = 0; i < answer.length; i++) {
            int su = answer[i];
            if (su >= num) {
                while (su >= num) {
                    stk.push(num++);
                    sb.append("+\n");
                }
                stk.pop();
                sb.append("-\n");
            } else {
                int top = stk.pop();
                if (top > su) {
                    System.out.println("NO");
                    result = false; // 종료 조건
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if (result) System.out.println(sb.toString());
    }
}
