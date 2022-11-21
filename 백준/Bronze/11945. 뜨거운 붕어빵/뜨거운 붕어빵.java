import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int N, M;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        for (int i = 0; i < N; i++) {
            StringBuffer sb = new StringBuffer(br.readLine());
            String reverse = sb.reverse().toString();
            System.out.println(reverse);
        }
    }
}