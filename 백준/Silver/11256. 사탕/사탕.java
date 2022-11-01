import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int TC, N, M, cnt;
    static Integer[] boxes;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        TC = Integer.parseInt(br.readLine());
        for (int i = 0; i < TC; i++) {
            input();
            logic();
        }
        System.out.println(sb);
    }

    public static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        boxes = new Integer[M];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            int Z = Integer.parseInt(st.nextToken());
            boxes[i] = K * Z;
        }

        Arrays.sort(boxes, Collections.reverseOrder());
    }

    public static void logic() {
        cnt = 0;
        for (int i = 0; i < M; i++) {
            cnt += boxes[i];

            if (cnt >= N) {
                sb.append(i + 1).append('\n');
                break;
            }
        }
    }
}
