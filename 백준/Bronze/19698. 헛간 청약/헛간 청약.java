import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int CNT, M, T, C;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        CNT = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        int cow = (M / C) * (T / C);

        if (cow >= CNT) {
            System.out.println(CNT);
        } else {
            System.out.println(cow);
        }

    }
}
