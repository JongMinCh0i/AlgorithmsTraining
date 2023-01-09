import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int[] arr1, arr2;
    static int N, M, cnt;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        while (N != 0 && M != 0) {
            cnt = 0;

            arr1 = new int[N];
            arr2 = new int[M];

            for (int i = 0; i < N; i++) {
                int K = Integer.parseInt(br.readLine());
                arr1[i] = K;
            }

            for (int i = 0; i < M; i++) {
                int V = Integer.parseInt(br.readLine());
                arr2[i] = V;
            }

            if (N > M) {
                for (int i = 0; i < N; i++) {
                    if (binarySearch(arr2, 0, M - 1, arr1[i]) > -1) {
                        cnt++;
                    }
                }
            } else {
                for (int i = 0; i < M; i++) {
                    if (binarySearch(arr1, 0, N - 1, arr2[i]) > -1) {
                        cnt++;
                    }
                }
            }

            sb.append(cnt).append('\n');

            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            if (N == 0 && M == 0) {
                break;
            }
        }
        System.out.println(sb);
    }

    static int binarySearch(int[] arr, int L, int R, int X) {
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
        return -2;
    }
}