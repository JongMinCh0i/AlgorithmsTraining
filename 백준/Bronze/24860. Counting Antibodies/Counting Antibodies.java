import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K, V;
    static int[] arrInt;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        arrInt = new int[3];
        br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = N * M;
            arrInt[i] = K;
        }

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arrInt[2] = N * M * k;

        long ans = (long) (arrInt[0] + arrInt[1]) * arrInt[2];

        System.out.println(ans);

    }
}