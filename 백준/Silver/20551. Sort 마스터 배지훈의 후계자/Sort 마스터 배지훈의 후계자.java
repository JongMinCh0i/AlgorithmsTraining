import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N, M;
    static int[] arr, arr2;

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

        arr = new int[N];
        arr2 = new int[M];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(br.readLine());
            arr2[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(arr);

        for (int i = 0; i < M; i++) {
            // 중복 값일 때 처리

            int lower_temp = lower_Bound(arr, 0, N, arr2[i]);
            int br_temp = brSearch(arr, 0, N - 1, arr2[i]);

            if (lower_temp < br_temp) {
                sb.append(lower_temp).append('\n');
            } else {
                sb.append(br_temp).append('\n');
            }

        }

        System.out.print(sb);
    }

    static int brSearch(int[] arr, int L, int R, int X) {
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == X) {
                return mid;
            } else if (arr[mid] < X) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return -1;
    }

    static int lower_Bound(int[] arr, int L, int R, int X) {
        while (L < R) {
            int mid = (L + R) / 2;
            if (arr[mid] >= X) {
                R = mid;
            } else {
                L = mid + 1;
            }
        }
        return L;
    }
}
