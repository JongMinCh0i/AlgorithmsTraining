
import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A == 1 && B == 2) {sb.append("B");} // 가위 vs 바위
        if (A == 2 && B == 1) {sb.append("A");}

        if (A == 1 && B == 3) {sb.append("A");} // 가위 vs 보
        if (A == 3 && B == 1) {sb.append("B");}

        if (A == 3 && B == 2) {sb.append("A");} // 보 vs 바위
        if (A == 2 && B == 3) {sb.append("B");}

        System.out.println(sb);

    }
}