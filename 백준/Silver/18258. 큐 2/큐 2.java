import java.io.*;
import java.util.*;

public class Main {
    static Integer lastNum = 0;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
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
//                        System.out.println("-1");
                        sb.append("-1").append('\n');
                    } else {
//                        System.out.println(queue.peek());
                        sb.append(queue.peek()).append('\n');
                        ;
                    }
                    break;
                case "back":
                    if (queue.size() == 0) {
//                        System.out.println("-1");
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(lastNum).append('\n');
                    }
                    break;
                case "size":
                    if (queue.size() > 0) {
                        sb.append(queue.size()).append('\n');
                    } else {
                        sb.append("0").append('\n');
                    }
                    break;
                case "empty":
                    if (queue.size() == 0) {
                        sb.append("1").append('\n');
                    } else {
                        sb.append("0").append('\n');
                    }
                    break;
                case "pop":
                    if ((queue.size() == 0)) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(queue.poll()).append('\n');
                    }
            }
        }
        System.out.print(sb.toString());
    }
}
