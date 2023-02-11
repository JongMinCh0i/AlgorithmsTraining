import java.io.*;
import java.util.*;

public class Solution {
    static BufferedReader br;
    static StringBuilder sb;
    static int CNT, ans;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        CNT = Integer.parseInt(br.readLine());

        ans = 1;

        if (CNT == 1) {
            sb.append(1);
            System.out.println(sb);
            System.exit(0);
        } else {
            sb.append(1).append(" ");

        }

        for (int i = 1; i <= CNT; i++) {
            sb.append(ans *= 2).append(" ");
        }

        System.out.println(sb);
    }
}