import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder stringBuilder;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stringBuilder = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            if (N == 0 && M == 0 && K == 0) {
                break;
            }

            calc(N, M, K);

        }
    }

    static void calc(int N, int M, int K) {

        if ((N * N + M * M) == K * K) {
            System.out.println("right");
        } else if (N * N == (M * M + K * K)) {
            System.out.println("right");
        } else if (M * M == (K * K + N * N)) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}