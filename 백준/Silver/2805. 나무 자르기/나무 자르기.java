import java.io.*;
import java.util.*;

class Main {
    static int N, M;
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int[] arrInt;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arrInt = new int[N];
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arrInt[i] = num;
        }
    }

    static boolean check(int H) {
        long ans = 0;
        for (int i = 0; i < N; i++) {
            if (arrInt[i] > H) {
                ans += arrInt[i] - H;
            }
        }

        if (ans >= M)  return true;
        else return false;
    }

    static void logic() {
        Arrays.sort(arrInt);
        long L = 0;
        int R = Integer.MAX_VALUE;
        long X = 0;
        while (L <= R) {
            int mid = (int) (L + R) / 2;
            if (check(mid)) {
                X = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        System.out.println(X);
    }
}

