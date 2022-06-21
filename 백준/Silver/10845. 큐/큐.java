import java.io.*;
import java.util.*;

public class Main {
    static Integer lastNum = 0;
    static Queue<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        for (int i = 0; i < A; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            switch (st.nextToken(" ")) {
                case "push":
                    int N = Integer.parseInt(st.nextToken());
                    queue.add(N);
                    lastNum = N;

                    break;
                case "front":
                    if (queue.size() == 0) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;
                case "back":
                    if (queue.size() == 0) {
                        System.out.println("-1");
                    } else {
                        System.out.println(lastNum);
                    }
                    break;
                case "size":
                    if (queue.size() > 0) {
                        System.out.println(queue.size());
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "empty":
                    if (queue.size() == 0) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "pop":
                    if ((queue.size() == 0)) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.poll());
                    }
            }
        }
    }
}
