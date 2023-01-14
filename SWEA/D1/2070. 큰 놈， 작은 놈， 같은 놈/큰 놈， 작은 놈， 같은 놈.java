import java.io.*;
import java.util.*;

public class Solution {
    static int cnt;
    static int TC;
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        TC = Integer.parseInt(br.readLine());

        for (int i = 0; i < TC; i++) {
            String str = br.readLine();
            logic(str);
        }

        System.out.println(sb);
    }

    static void logic(String str) {
        String num = "";
        st = new StringTokenizer(str);
        cnt++;
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());

        if (i < j) num = "<";
        if (i > j) num = ">";
        if (i == j) num = "=";

        sb.append("#").append(cnt + " ").append(num).append('\n');

    }
}
