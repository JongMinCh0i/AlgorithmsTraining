import java.io.*;
import java.util.*;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    public static void input() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    public static void logic() {
        int ans = (M * 2) - N;
        System.out.println(ans);
    }
}
