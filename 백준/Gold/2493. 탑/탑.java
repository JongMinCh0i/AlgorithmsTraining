import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static Deque<int[]> castle = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine());

        for (int idx = 1; idx <= N; idx++) {
            int value = Integer.parseInt(st.nextToken());

            while (!castle.isEmpty() && castle.peek()[1] < value) {
                castle.pop();
            }

            if (castle.isEmpty()) {
                sb.append(0).append(' ');
            } else {
                sb.append(castle.peek()[0]).append(' ');
            }
            castle.push(new int[]{idx, value});
        }

        System.out.println(sb);
    }
}