import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static long sum;
    static Integer[] arr;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];

        for (int i = 0; i < N; i++) {arr[i] = Integer.parseInt(br.readLine());}

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int num = arr[i] - ((i + 1) - 1);
            if (num < 0) {
                continue;
            }
            sum += num;
        }

        sb.append(sum);
        System.out.println(sb);
    }
}
