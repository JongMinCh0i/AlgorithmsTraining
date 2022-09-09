import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K, CNT, tempTIme;
    static int temp;
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        CNT = Integer.parseInt(br.readLine());
    }


    static void logic() {
        int tempH = N * 3600;
        int tempM = M * 60;
        int tempS = K;
        tempTIme = tempH + tempM + tempS + CNT;

        int H = tempTIme / 3600;
        int M = ((tempTIme % 3600) / 60);
        int S = tempTIme % 60;
        if (H >= 24) {
            H %= 24;
        }
        sb.append(H).append(" ").append(M).append(" ").append(S).append(" ");

        System.out.println(sb);

    }
}


