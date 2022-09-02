import java.io.*;
import java.util.*;

public class Main {
    static int A, B, C, D, F;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        D = Integer.parseInt(br.readLine());
        F = Integer.parseInt(br.readLine());
    }

    static void logic() {
        int ansTemp = B - (A);
        int numTemp = Math.abs(A); // 영상온도

        if (A > 0) { // 고기가 0도 이상일 떄 해동 필요하지 않음
            sb.append(ansTemp * F);
        } else if (A < 0) { // 고기가 얼어 있다. 온도가 C초에 1초
            int ans = D + (numTemp * C) + (F * B);
            if (A == 0) {
                ans -= D;
            }
            sb.append(ans);
        }

        System.out.println(sb);

    }
}
