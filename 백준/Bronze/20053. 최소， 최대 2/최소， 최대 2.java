import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static List<Integer> list;
    static StringBuilder sb;
    static int CNT;
    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        CNT = Integer.parseInt(br.readLine());

        for (int i = 0; i < CNT; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append(arr[0]).append(" ").append(arr[N - 1]).append('\n');
        }

        System.out.println(sb);
    }
}
