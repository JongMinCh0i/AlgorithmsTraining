import java.io.*;
import java.util.*;

public class Main {
    //3가지 : StringBuilder, StringTokenizer, BufferedReader
    static StringBuilder sb;
    static BufferedReader br;
    static int N;
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
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void logic() {
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            int num = arr[i];
            sb.append(num).append('\n');
        }

        System.out.println(sb);
    }
}