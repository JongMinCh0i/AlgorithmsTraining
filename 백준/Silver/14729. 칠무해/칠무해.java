import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static int N;
    static double[] arr;
    public static void main(String[] args) throws IOException {

        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new double[N];

        for (int i = 0; i < N; i++) {
            double ans = Double.parseDouble(br.readLine());
            arr[i] = ans;
        }
    }

    static void logic() {
        Arrays.sort(arr);

        for (int i = 0; i < 7; i++) {
            sb.append(String.format("%.3f",arr[i])).append('\n');
        }

        System.out.print(sb);
    }
}
