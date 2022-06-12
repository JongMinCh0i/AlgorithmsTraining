import java.io.*;
import java.util.*;

public class Main {
    static Stack<Integer> stk = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        for (int i = 0; i < A; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            switch (st.nextToken(" ")) {
                case "push":
                    stk.add(Integer.parseInt(st.nextToken()));
                    break;
                case "top":
                    if (stk.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stk.peek());
                    }
                    break;
                case "size":
                    if (stk.size() > 0) {
                        System.out.println(stk.size());
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "empty":
                    if (stk.empty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "pop":
                    if (stk.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stk.pop());
                    }
            }
        }
    }
}
