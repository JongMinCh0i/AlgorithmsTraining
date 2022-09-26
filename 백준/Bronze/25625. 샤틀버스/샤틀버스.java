import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N, M;

    public static void main(String[] args) throws IOException {
        input();

    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if (N < M) {
            sb.append(M - N);
        } else if (N > M) {
            sb.append(N + M);
        }
        System.out.println(sb);
    }
}
