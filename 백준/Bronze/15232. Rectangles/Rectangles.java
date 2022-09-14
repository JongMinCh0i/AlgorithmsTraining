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
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append("*");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
