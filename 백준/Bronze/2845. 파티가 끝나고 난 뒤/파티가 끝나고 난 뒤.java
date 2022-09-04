import java.io.*;
import java.util.*;

public class Main {
    static int N, M, area;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        area = N * M;

        arr = new int[5];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void logic() {
        for (int i = 0; i < 5; i++) {
            int k = arr[i];
            int ans = -area + k;

            sb.append(ans).append(' ');
        }
        System.out.println(sb);
    }
}
