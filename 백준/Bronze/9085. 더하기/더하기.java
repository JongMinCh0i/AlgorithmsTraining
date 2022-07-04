import java.io.*;
import java.util.*;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            M = Integer.parseInt(br.readLine());
            int sum = 0;
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            sb.append(sum).append('\n');
        }
        System.out.println(sb);

    }
}