import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static Integer[] arr;
    static int N;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }


    }

    static void logic() {
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int ans = arr[i];
            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
