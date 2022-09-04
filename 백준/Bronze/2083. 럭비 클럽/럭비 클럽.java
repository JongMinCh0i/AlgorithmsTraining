import java.io.*;
import java.util.*;

public class Main {
    static int N, M; // 나이, 몸무게
    static String name;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            if (name.equals("#") && N == 0 && M == 0) {
                break;
            }

            if (N > 17 || M >= 80) {
                sb.append(name).append(" Senior").append('\n');
            } else {
                sb.append(name).append(" Junior").append('\n');

            }
        }
        System.out.println(sb);

    }
}

