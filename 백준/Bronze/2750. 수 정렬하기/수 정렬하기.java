import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N; // 입력받는 수
    static int[] arr;
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            int ans = arr[i];

            sb.append(ans).append('\n');
        }

        System.out.println(sb);
    }

}
