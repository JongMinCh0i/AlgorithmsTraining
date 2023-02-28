import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        if (12 <= N && N <= 16) {


            if (M == 0) {
                sb.append(320);
                System.out.println(sb);
                return;
            }

        }

        sb.append(280);
        System.out.println(sb);

    }
}
