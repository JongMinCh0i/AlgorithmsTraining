import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N, cnt, check;
    static String check1;
    static String M;
    static char check2, check3;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = st.nextToken();

        check2 = M.charAt(0);
    }

    static void logic() {
        cnt = 0;
        check = 0;

        for (int i = 1; i <= N; i++) {
            check++;
            check1 = String.valueOf(check);

            for (int j = 0; j < check1.length(); j++) {
                check3 = check1.charAt(j);
                if (check2 == (check3)) cnt++;

            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}
