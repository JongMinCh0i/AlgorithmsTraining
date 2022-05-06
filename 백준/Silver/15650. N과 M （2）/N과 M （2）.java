import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

    static int N, M;
    static int[] list;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new int[M + 1];

        ref_func(1);
        System.out.println(sb.toString());
    }

    static void ref_func(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) sb.append(list[i]).append(' ');
            sb.append('\n');
        } else {
            for (int cand = list[k-1] + 1; cand <= N; cand++) {
                list[k] = cand;
                ref_func(k + 1);
                list[k] = 0;
            }
        }
    }
}

