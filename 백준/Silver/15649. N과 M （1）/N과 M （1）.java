import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[] list, used;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new int[M + 1];
        used = new int[N + 1];

        ref_func(1);
        System.out.println(sb.toString());
    }

    static void ref_func(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) sb.append(list[i]).append(' ');
            sb.append('\n');

        } else {
            for (int cand = 1; cand <= N; cand++) {
                if (used[cand] == 1) continue;
                list[k] = cand;
                used[cand] = 1;

                ref_func(k + 1);

                list[k] = 0;
                used[cand] = 0;
            }
        }
    }
}

