import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        logic(N, K);
    }

    public static void logic(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        sb.append("<");

        while (queue.size() != 0) {
            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll());
            if (queue.size() > 0) {
                sb.append(", ");}
        }

        sb.append(">");

        System.out.println(sb);

    }
}
