import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int Cnt;
    static int W, K;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sb);
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        Cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < Cnt; i++) {
            st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            logic(W, K);
        }
    }

    static void logic(int W, int K) {
        int RoomAvg = W * K;
        if (RoomAvg == 1) {
            sb.append("0").append('\n');
        } else {
            int ans = RoomAvg / 2;
            sb.append(ans).append('\n');
        }
    }
}
