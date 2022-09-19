import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N, M;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
    }

    static void logic() {
        if (N == 2 && M == 18) {
            sb.append("Special");
        }

        if (N < 2) {
            sb.append("Before");
        }

        if (N > 2) {
            sb.append("After");
        }

        if (N == 2 && M < 18) {
            sb.append("Before");
        } else if (N == 2 && M > 18) {

            sb.append("After");
        }

        System.out.println(sb);
    }
}