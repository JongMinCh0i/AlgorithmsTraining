import java.io.*;
import java.util.*;

public class Solution {
    static StringBuilder sb;
    static BufferedReader br;
    static int N = 0;


    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        int Cnt = Integer.parseInt(br.readLine());
        int ans = Cnt;

        for (int i = 0; i < Cnt; i++) {
            N += ans--;
        }

        sb.append(N);
        System.out.println(sb);
    }
}