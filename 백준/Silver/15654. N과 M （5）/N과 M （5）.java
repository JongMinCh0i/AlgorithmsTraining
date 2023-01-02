import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N, M;
    static int[] selected, temp;
    static boolean[] checked;

    public static void main(String[] args) throws IOException {
        input();
        rec_fun(0);
        System.out.println(sb);
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        temp = new int[N];
        selected = new int[M];
        checked = new boolean[10];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(temp);
    }


    static void rec_fun(int k) {
        if (k == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = 0; i < N; i++) {
                if (!checked[i]) {
                    selected[k] = temp[i];
                    checked[i] = true;
                    rec_fun(k + 1);
                    checked[i] = false;
                }
            }
        }
    }
}