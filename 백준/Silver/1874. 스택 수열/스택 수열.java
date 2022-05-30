import java.io.*;


/**
 *  해당 문제의 주요한 키 포인트는  [오름차순, 1부터 n 까지의 수, ]
 *  스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다는 점에 있다.
 *  또한 해당 stack에 push하는 순서가 반드시 오름차순을 지켜야 한다는 점.
 *  임의의 수열이 주어졌을 때 이 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면
 *  어떠한  순서로  push, pop 연산을 수행해야 하는지를 알아 낼 수 있다고 한다.
 *
 *
 *
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] answer = new int[N];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < N; i ++) {
            answer[i] = sc.nextInt();
        }

        int num = 1;
        StringBuffer sb = new StringBuffer();
        boolean result = true;

        for (int i = 0; i < answer.length; i++) {
            int su = answer[i]; // 현재 0번째 수열 위치
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
