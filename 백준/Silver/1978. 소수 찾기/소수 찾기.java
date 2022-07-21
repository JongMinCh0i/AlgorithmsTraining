//첫번째 풀이는 2부터 판별하는 수 전까지 나눠보고 나머지가 0이 안나온다면 소수로 정의한다.
//        해당 수까지 모두 확인해야하므로 시간복잡도는 O(N)이 되고, 가장 원초적인 방법이다.

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int[] arr;
    static int N, cnt;

    public static void main(String[] args) throws IOException {
        input();

        for (int i = 0; i < N; i++) {
            if(logic(arr[i])){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    static boolean logic(int start) {
        if (start < 2) return false;
        // 해당 수 까지 처리해야함으로 <= (이상 처리)
        for (int i = 2; i * i <= start; i++) {
            if (start % i == 0) return false;
        }
        return true;
    }
}