import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int TC;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        TC = Integer.parseInt(br.readLine());

        for (int i = 0; i < TC; i++) {
            input();
        }
    }

    static void input() throws IOException {
        int yonCNT = 0;
        int koreaCNT = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            yonCNT += Integer.parseInt(st.nextToken());
            koreaCNT += Integer.parseInt(st.nextToken());
        }

        if (yonCNT == koreaCNT) {
            System.out.println("Draw");
        }
        if (yonCNT > koreaCNT) {
            System.out.println("Yonsei");
        }
        if (yonCNT < koreaCNT) {
            System.out.println("Korea");
        }
    }
}