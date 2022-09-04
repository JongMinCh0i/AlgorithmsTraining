import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] A;
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        A = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            A[i] = num;
        }
    }

    static void logic() throws IOException {
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        Arrays.sort(A, 1, N + 1);
        for (int i = 1; i <= M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(A, 1, N, num)).append('\n');
        }

        System.out.println(sb);
    }

    static int binarySearch(int[] arr, int L, int R, int X) {
        while (L <= R) {
            int mid = (L + R) / 2;

            if (arr[mid] < X) {
                L = mid + 1;
            } else if (arr[mid] > X) {
                R = mid - 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}