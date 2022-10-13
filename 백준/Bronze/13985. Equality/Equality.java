import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static int N, M, Res;
    static String sign;
    static String equal;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        sign = st.nextToken();
        M = Integer.parseInt(st.nextToken());
        equal = st.nextToken();
        Res = Integer.parseInt(st.nextToken());

        if (N + M == Res) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
