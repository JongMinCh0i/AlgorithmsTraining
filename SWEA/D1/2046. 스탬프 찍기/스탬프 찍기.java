import java.io.*;
import java.util.*;

public class Solution {
    static int N;
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append("#");
        }
        
        System.out.println(sb);
    }
}
