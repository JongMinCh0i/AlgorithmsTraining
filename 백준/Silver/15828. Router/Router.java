import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static Queue<Integer> queue;
    static int CNT;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        CNT = Integer.parseInt(br.readLine());
        queue = new LinkedList<Integer>();

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == -1) {
                if (queue.size() == 0) {
                    sb.append("empty");
                } else {
                    for (int i = 0; i < CNT; i++) {
                        Integer num1 = queue.poll();
                        if (num1 != null) {
                            sb.append(num1).append(' ');
                        } else {
                            break;
                        }
                    }
                }
                System.out.print(sb);
                break;
            } else if (num == 0) {
                queue.remove();
            } else {
                if (queue.size() < CNT) {
                    queue.add(num);
                }
            }
        }
    }
}