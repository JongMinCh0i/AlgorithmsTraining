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
        st = new StringTokenizer(str);
        cnt++;
        double avg = 0;

        for (int j = 0; j < 10; j++) {
            avg += Integer.parseInt(st.nextToken());
        }

        int num = (int) Math.round(((avg / 10) * 10) / 10.0);

        sb.append("#").append(cnt + " ").append(num).append('\n');

    }
}
