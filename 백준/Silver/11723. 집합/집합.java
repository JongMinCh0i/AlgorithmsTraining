import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N, value;
    static Set<Integer> set;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        set = new HashSet<>();
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            if (st.hasMoreTokens()) {
                value = Integer.parseInt(st.nextToken());
            }

            switch (method) {
                case "add":
                    add(value);
                    break;
                case "remove":
                    remove(value);
                    break;
                case "check":
                    check(value);
                    break;
                case "toggle":
                    toggle(value);
                    break;
                case "all":
                    all();
                    break;
                case "empty":
                    empty();
                    break;
            }
        }

        System.out.println(sb);
    }

    static void add(int i) {
        set.add(i);
    }

    static void check(int i) {
        if (set.contains(i)) {
            sb.append(1).append('\n');
        } else {
            sb.append(0).append('\n');
        }
    }

    static void remove(int i) {
        set.remove(i);
    }

    static void toggle(int i) {
        if (set.contains(i)) {
            set.remove(i);
        } else {
            set.add(i);
        }
    }

    static void all() {
        set.clear();
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }
    }

    static void empty() {
        set.clear();
    }
}