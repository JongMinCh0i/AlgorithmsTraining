import java.io.*;
import java.util.*;

public class Solution {
    static int[] intArr;
    static int cnt, num;
    static int TC;
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            num += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        sb.append(num);
        System.out.println(sb);
    }
}