import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N;
    static ArrayList<Integer> arrList;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arrList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arrList.add(num);
        }

        Collections.sort(arrList);

        List<Integer> collect = arrList.stream()
                .distinct()
                .collect(Collectors.toList());

        for (int i = 0; i < collect.size(); i++) {
            sb.append(collect.get(i)).append(" ");
        }

    }

    static void logic() {
        System.out.println(sb);
    }
}
