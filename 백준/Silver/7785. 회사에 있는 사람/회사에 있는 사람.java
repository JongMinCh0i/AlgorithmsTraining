import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N;
    static Set<String> Set;
    static ArrayList<String> name;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Set = new HashSet<>();
        name = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            String method = st.nextToken();

            if (method.equals("enter")) {
                Set.add(str);
            } else if (method.equals("leave")) {
                Set.remove(str);
            }
        }
    }

    static void logic() {
        Iterator<String> check = Set.iterator();

        while (check.hasNext()) {
            name.add(check.next());
        }

        Collections.sort(name);

        for (int k = name.size() - 1; k >= 0; k--) {
            sb.append(name.get(k)).append('\n');
        }

        System.out.print(sb);
    }
}
