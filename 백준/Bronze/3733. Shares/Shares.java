import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static String input;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        input();

    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        input = " ";

        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input);
            N = Integer.parseInt(st.nextToken()) + 1;
            M = Integer.parseInt(st.nextToken());

            System.out.println(M / N);
        }
    }
}