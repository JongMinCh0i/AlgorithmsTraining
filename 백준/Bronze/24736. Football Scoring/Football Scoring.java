import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N, M ,V, K , Z;
    public static void main(String[] args) throws IOException {
        input();

        System.out.print(sb);
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            Z = Integer.parseInt(st.nextToken());
            int num = (N * 6) + (M * 3) + (V * 2) + (K) + (Z * 2);
            sb.append(num).append(' ');
        }


    }
}
