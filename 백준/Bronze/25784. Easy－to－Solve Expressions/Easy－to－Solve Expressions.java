import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int N, M, T;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        if (N + M == T || M + T == N || N + T == M) {
            System.out.println("1");
        } else if (N * M == T || M * T == N || N * T == M) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
