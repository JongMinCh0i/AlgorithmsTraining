import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N, M, FIND;
    static long[] A, B;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new long[N];
        B = new long[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(st.nextToken());
            A[i] = num;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            long num = Long.parseLong(st.nextToken());
            B[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < M; i++) {
            int remove_idx = BR(A, 0, A.length - 1, B[i]);
            if (remove_idx == -1) continue;

            A[remove_idx] = -1;
        }

        sb.append(A.length - FIND).append('\n');

        for (int i = 0; i < A.length; i++) {
            if (A[i] == -1) continue;

            sb.append(A[i]).append(" ");
        }

        System.out.print(sb);
    }

    static int BR(long[] arr, int L, int R, long X) {
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == X) {
                FIND++;
                return mid;
            } else if (arr[mid] < X) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return -1;
    }
}