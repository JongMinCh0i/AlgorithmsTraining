import java.io.*;
import java.util.*;

public class Main {
    static int N, K;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        logic(N,K);
    }

    public static void logic(int N, int K) {
        int answer = fac(N) / (fac(K) * fac(N - K));

        System.out.println(answer);
    }

    public static int fac(int i) {
        if (i == 0) {
            return 1;
        } else {
            return i * fac(i - 1);
        }
    }
}
