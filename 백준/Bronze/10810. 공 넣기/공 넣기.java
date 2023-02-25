import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];
    }

    static void logic() throws IOException {
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            getLogic(start, end, value);
        }

        for (int i = 1; i <= N; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }

    static void getLogic(int start, int end, int value) {
        if (start == end) {
            arr[start] = value;
            return;
        }

        for (int i = start; i <= end; i++) {
            arr[i] = value;
        }
    }
}
