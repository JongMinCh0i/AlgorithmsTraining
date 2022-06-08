// 0이 입력될 경우 최근에 들어간 수를 지운다.
// 잃게 모든 수를 받아 적은 후 그 수의ㅎ 합을 알고 싶어한다.

import java.io.*;
import java.util.*;

public class Main {
    static int num = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();

        int A = Integer.parseInt(br.readLine());

        int[] arr = new int[A];

        // 값의 저장
        for (int i = 0; i < A; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            int su = arr[i];
            if (su == 0 && !stk.empty()) {
                stk.pop();
                continue;
            }
            stk.push(arr[i]);
        }

        // 값의 출력
        if (stk.empty()) {
            num = 0;
        } else{
            while(!stk.empty()) {
                    num += stk.pop();
                }
            }
        System.out.println(num);
    }
}