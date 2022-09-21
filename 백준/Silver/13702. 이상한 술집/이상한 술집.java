import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int[] A;
    static int N, K; // 막걸리를 주문한 주전자의 갯수 N; 은상이를 포함한 친구들의 수 K
    static int MAX;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        A = new int[N];

        for (int i = 0; i < N; i++) {
            int N = Integer.parseInt(br.readLine());
            A[i] = N;
        }
    }

    static void logic() {
        long L = 0, R = Integer.MAX_VALUE, X = 0;
//        for (int i = 0; i < N; i++) MAX = Math.max(A[i], MAX);
//        R = MAX;

        while (L <= R) {
            long mid = (L + R) / 2;
            if (determination(mid)) {
                X = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        sb.append(X);
        System.out.println(sb);
    }

    static boolean determination(long H) {
        if (H == 0) {
            return false;
        }

        long cnt = 0;
        for (int i = 0; i < N; i++) {
            cnt += A[i] / H;
        }

        return cnt >= K;
    }
}