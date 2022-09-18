import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static int N;


    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (true) {
            if (queue.size() == 1) {
                sb.append(queue.poll()).append(" ");
                break;
            } else {
                sb.append(queue.poll()).append(" ");
                queue.add(queue.poll());
            }
        }
        System.out.println(sb);
    }
}

