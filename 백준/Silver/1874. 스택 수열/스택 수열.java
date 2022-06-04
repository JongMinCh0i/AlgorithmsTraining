/*
 * 해당 문제의 주요한 키 포인트는  [오름차순, 1부터 n 까지의 수, ]
 * 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다는 점에 있다.
 * 또한 해당 stack에 push하는 순서가 반드시 오름차순을 지켜야 한다는 점.
 * 임의의 수열이 주어졌을 때 이 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면
 * 어떠한  순서로  push, pop 연산을 수행해야 하는지를 알아 낼 수 있다고 한다.
 * boolean true value 실행 조건 설정
 * 현재 수열 값 >= 자연수
 * 현재 수열 값 < 자연수
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();
        StringBuffer sb = new StringBuffer();

        boolean condition = true;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int su = 1;

        for (int num : arr) {
            if (num >= su) {
                while (num >= su) {
                    stk.push(su++);
                    sb.append("+\n");
                }
                stk.pop();
                sb.append("-\n");
            } else { // num(arr의 값) < su(1부터 증가하는 순번)
                int top = stk.pop(); // stk의 값은 순차적으로 + 1 씩 커지므로 해당 상황에서 top은 해당 배열의 최대치다.
                if (top > num) {
                    System.out.println("NO");
                    condition = false;
                    break;
                } else { // top <= num : 상위의 값이 num(arr[i])과 같거나 작을 경우 - 처리
//                    stk.pop(); :
                    sb.append("-\n");
                }

            }
        }
            if (condition) // 주석 처리 할 경우 BOJ 출력 초과 
                System.out.println(sb);
    }
}
