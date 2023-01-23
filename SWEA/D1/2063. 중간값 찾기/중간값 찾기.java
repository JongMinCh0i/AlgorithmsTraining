import java.io.*;
import java.util.*;

public class Solution {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, k;
    static int[] arrInt;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arrInt = new int[N + 1];
        k = 1;

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            arrInt[k] = num;
            k++;
        }

        Arrays.sort(arrInt);
        sb.append(arrInt[N / 2] + 1);
        System.out.println(sb);
    }
}