import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N == K || M == K || N == M) {
            System.out.println("S");
            System.exit(0);
        }

        if (N == M + K || M == N + K || K == N + M) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
