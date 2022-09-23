import java.io.*;
import java.util.*;

public class Main {
    static int TC, N, M;
    static int[] arr, arr2;
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        TC = Integer.parseInt(br.readLine());

        for (int i = 0; i < TC; i++) {
            input();
            logic();
        }
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        M = Integer.parseInt(br.readLine());
        arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr2[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(arr);

        for (int i = 0; i < M; i++) {
            sb.append(BrSearch(arr, 0, N - 1, arr2[i])).append('\n');
        }
        System.out.print(sb);

    }

    static int BrSearch(int[] arr, int L, int R, int X) {
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == X) {
                return 1;
            } else if (arr[mid] < X) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return 0;
    }
}
