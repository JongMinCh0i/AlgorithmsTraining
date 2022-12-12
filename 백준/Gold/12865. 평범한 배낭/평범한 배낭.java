import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N, M;
    static int[] weight, value;
    static int[][] K;

    public static void main(String[] args) throws IOException {
        input();
        sb.append(ks_DP01(N, M));
        System.out.println(sb);
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        weight = new int[N + 1];
        value = new int[N + 1];
        K = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }
    }

    static int ks_DP01(int N, int M) {
        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= M; w++) {
                if (weight[i] > w) K[i][w] = K[i - 1][w];
                else {
                    K[i][w] = Math.max(K[i - 1][w], K[i - 1][w - weight[i]] + value[i]);
                }
            }
        }
        return K[N][M];
    }
}