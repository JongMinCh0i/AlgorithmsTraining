import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
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
        arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            int fruit = arr[i];

            if (fruit <= M) {
                M++;
            } else {
                break;
            }

        }
        sb.append(M);
        System.out.println(sb);
    }
}

