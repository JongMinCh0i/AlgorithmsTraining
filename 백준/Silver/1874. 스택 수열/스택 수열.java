/**
 * 해당 문제의 주요한 키 포인트는  [오름차순, 1부터 n 까지의 수, ]
 * 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다는 점에 있다.
 * 또한 해당 stack에 push하는 순서가 반드시 오름차순을 지켜야 한다는 점.
 * 임의의 수열이 주어졌을 때 이 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면
 * 어떠한  순서로  push, pop 연산을 수행해야 하는지를 알아 낼 수 있다고 한다.
 * boolean true value 실행 조건 설정
 * 현재 수열 값 >= 자연수
 * <p>
 * 현재 수열 값 < 자연수
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stk = new Stack<>();
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        boolean condition = true;
        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            int su = arr[i];
            if (su >= num) {
                while (su >= num) {
                    stk.push(num++);
                    sb.append("+ \n");
                }
                stk.pop();
                sb.append("- \n");
            } else {
                int n = stk.pop();
                if (n > su) {
                    System.out.println("NO");
                    condition = false;
                    break;
                } else if (n <= su) {
                    sb.append("-\n");
                }
            }
        }
        if (condition)
            System.out.println(sb.toString());
    }
}