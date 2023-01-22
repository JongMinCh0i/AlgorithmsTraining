import java.io.*;
import java.util.*;

public class Solution {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        sb.append(N + M).append('\n');
        sb.append(N - M).append('\n');
        sb.append(N * M).append('\n');
        sb.append(N / M).append('\n');

        System.out.println(sb);
    }
}