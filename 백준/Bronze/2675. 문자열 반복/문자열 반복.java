import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(br.readLine());

        for (int i = 0; i < A; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < B; k++) {
                    sb.append(str.charAt(j));
                }

            }
            sb.append('\n');
        }
        System.out.println(sb);

    }
}
