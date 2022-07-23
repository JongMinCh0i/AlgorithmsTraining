import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int gcd, lcm;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        gcd = logic(N, M);
        lcm = (N * M) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int logic(int n, int m) {
        if (m == 0)
            return n;
        else
            return logic(m, n % m);
    }
}