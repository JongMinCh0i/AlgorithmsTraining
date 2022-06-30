import java.io.*;
import java.util.*;

public class Main {
    static Deque<Integer> stk = new LinkedList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(br.readLine());

        for (int i = 0; i < A; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            switch (st.nextToken(" ")) {
                case "push_front":
                    stk.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    stk.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "front":
                    if (stk.size() == 0) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(stk.getFirst()).append('\n');
                    }
                    break;
                case "back":
                    if (stk.size() == 0) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(stk.getLast()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(stk.size()).append('\n');
                    break;
                case "empty":
                    if (stk.size() == 0) {
                        sb.append("1").append('\n');
                    } else {
                        sb.append("0").append('\n');
                    }
                    break;
                case "pop_back":
                    if (stk.size() == 0) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(stk.getLast()).append('\n');
                        stk.removeLast();
                    }
                    break;
                case "pop_front":
                    if (stk.size() == 0) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(stk.getFirst()).append('\n');
                        stk.removeFirst();
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}