import java.io.*;
import java.util.*;

class Main {
    static StringBuilder sb;
    static StringTokenizer st;
    static BufferedReader br;
    static int N;
    static int[] origin, distinct;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        origin = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            origin[i] = num;
        }

        distinct = Arrays.stream(origin).distinct().toArray();
    }

    static void logic() {
        Arrays.sort(distinct);
        for (int i = 0; i < N; i++) {
            sb.append(lowerBound(distinct, 0, distinct.length, origin[i])).append(" ");
        }
        System.out.println(sb);
    }

    static int lowerBound(int[] arr, int L, int R, int X) {
        while (L < R) {
            int mid = (L + R) / 2;
            if (arr[mid] >= X) R = mid;
            else L = mid + 1;
        }
        return L;
    }
}