import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static long[] arrInt;
    static int K, N;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arrInt = new long[K];

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            arrInt[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(arrInt);

        long L = 1;
        long R = arrInt[K - 1];
        long X = 0;

        while (L <= R) {
            long mid = ((L + R) / 2);
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

    static boolean determination(long length) {
        // len 만큼의 길이로 랜선들을 잘랐을 때, N 개 만큼의 랜선을 얻을 수 있는가?
        long ans = 0;
        for (int i = 0; i < K; i++) {
            ans += arrInt[i] / length;
        }

        return ans >= N;
    }
}