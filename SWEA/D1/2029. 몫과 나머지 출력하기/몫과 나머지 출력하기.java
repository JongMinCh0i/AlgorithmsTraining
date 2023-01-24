import java.io.*;
import java.util.*;

public class Solution {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, K, M, cntNum;
    static int[] arrInt;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            logic(K, M);
        }

        System.out.println(sb);
    }

    static void logic(int N, int M) {
        cntNum++;
        sb.append("#").append(cntNum).append(" " + N / M).append(" " + N % M);
        sb.append('\n');
    }
}