import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static long[] memo;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            N = Integer.parseInt(br.readLine());

            if (N == 0) {
                System.out.println(sb);
                return;
            }



            sb.append(fun(N)).append('\n');


        }
    }

    static int fun(int N) {
        int result = 0 ;

        for (int i = 1; i <= N; i++) {
            result += i;
        }

        return result;
    }
}