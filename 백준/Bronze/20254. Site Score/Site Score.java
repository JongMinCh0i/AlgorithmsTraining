import java.io.*;
import java.util.*;

public class Main {
    static int N, M ,K, V;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        System.out.println((56 * N) + (24 * M) + (14 * K) + (6 * V));

    }
}
