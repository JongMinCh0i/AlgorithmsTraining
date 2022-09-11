import java.io.*;
import java.util.*;

public class Main {
    static int N, M , K;

    static int[] arr;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

    }

    static void logic() {
        int temp = K / (N * 2);
        int ans = temp * M;
        System.out.println(ans);
        
    }
}
