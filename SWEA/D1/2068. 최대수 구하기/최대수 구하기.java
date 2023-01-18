import java.io.*;
import java.util.*;

public class Solution {
    static int[] intArr;
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
        intArr = new int[10];

        st = new StringTokenizer(str);
        cnt++;
        for (int i = 0; i < 10; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(intArr);
        sb.append("#").append(cnt + " ").append(intArr[9]).append('\n');
    }
}
