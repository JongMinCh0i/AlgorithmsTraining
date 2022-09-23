import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N, Ans;
    static int[] arr;
    static ArrayList<Integer> arr2;

    public static void main(String[] args) throws IOException {

        input();
        logic();

    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        arr2 = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr2.add(num);
        }
    }

    static void logic() {
        Arrays.sort(arr);
        Collections.sort(arr2, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int ans = arr[i] * arr2.get(i);
            Ans += ans;
        }

        sb.append(Ans);
        System.out.println(sb);

    }
}
