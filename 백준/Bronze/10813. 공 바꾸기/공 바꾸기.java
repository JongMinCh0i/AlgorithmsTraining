import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M, temp;
    static int[] arrInt;

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
        temp = 0;
        arrInt = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arrInt[i] = i;
        }
    }

    static void swap(int i, int n) {
        temp = arrInt[i];
        arrInt[i] = arrInt[n];
        arrInt[n] = temp;

        temp = 0;
    }

    static void logic() throws IOException {
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int swap_left = Integer.parseInt(st.nextToken());
            int swap_right = Integer.parseInt(st.nextToken());
            swap(swap_left, swap_right);
        }

        for (int i = 1; i <= N; i++) {
            sb.append(arrInt[i]).append(" ");
        }

        System.out.println(sb);
    }
}
