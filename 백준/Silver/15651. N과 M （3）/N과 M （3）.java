import java.io.*;
import java.util.*;

public class Main {

    public static int N, M;
    public static StringBuilder sb = new StringBuilder();
    public static int[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M];
        rec_func(0);
        System.out.println(sb);
    }

    static void rec_func(int k) {
        if (k == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= N; i++) {
            selected[k] = i;
            rec_func(k + 1);
        }
    }
}
