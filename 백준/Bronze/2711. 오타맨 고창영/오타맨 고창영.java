import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            char[] charArr = str.toCharArray();

            for (int j = 0; j < charArr.length; j++) {
                char ch = str.charAt(j);
                if (j == K - 1) {
                    continue;
                } else {
                    sb.append(ch);
                }
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

}
