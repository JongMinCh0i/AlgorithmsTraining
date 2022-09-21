import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int N;
    static int ans;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());

            ans = A * (D + G);

            if (A == (D + G)) ans *= 2;

            arr[i] = ans;
        }
    }

    static void logic() {
        Arrays.sort(arr);

        System.out.println(arr[N - 1]);
    }
}
