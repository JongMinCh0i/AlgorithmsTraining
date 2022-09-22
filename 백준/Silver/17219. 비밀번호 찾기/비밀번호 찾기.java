import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static Map<String, String> IDnPW;
    static String[] request;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        IDnPW = new HashMap<>();
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        request = new String[M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String http = st.nextToken();
            String PW = st.nextToken();

            IDnPW.put(http, PW);
        }

        for (int i = 0; i < M; i++) {
            request[i] = br.readLine();
        }
    }

    static void logic() {
        for (int i = 0; i < M; i++) {
            String Key = request[i];

            if (IDnPW.containsKey(Key)) {
                sb.append(IDnPW.get(Key)).append('\n');

            }
        }

        System.out.println(sb);
    }
}
