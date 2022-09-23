import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N, M;
    static ArrayList<Integer> arr;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr.add(num);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr.add(num);
        }

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
