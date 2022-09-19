import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static long N, M, max;

    static long[] arr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Long.parseLong(st.nextToken());
        M = Long.parseLong(st.nextToken());

        arr = new long[(int) N];

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            arr[i] = num;
        }
    }

    static void logic() {
        long L = 0;
        long R = 1000000000;
        long ans = 0;

        for (int i = 0; i < N; i++) {
            L = Math.max(L, arr[i]);
        }
        
        while (L <= R) {
            long mid = (L + R) / 2;
            if (determination(mid)) {
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        sb.append(ans);
        System.out.println(sb);
    }

    static boolean determination(long H) {
        long cnt = 1;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            if (sum + arr[i] > H) {
                cnt++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return cnt <= M;
    }
}
