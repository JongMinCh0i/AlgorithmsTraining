import java.io.*;
import java.util.*;

public class Main {
    static int N;
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
        N = Integer.parseInt(br.readLine());
        arrInt = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arrInt[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(arrInt);
        int v1 = 0;
        int v2 = 0;
        int MAXNUM = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int candidate = lower_Bound(arrInt, i + 1, N, arrInt[i] * -1);

            if (candidate < N && Math.abs(arrInt[candidate] + arrInt[i]) < MAXNUM ) {
                MAXNUM = Math.abs(arrInt[candidate] + arrInt[i]);
                v1 = arrInt[i];
                v2 = arrInt[candidate];
            }

            if (i != candidate - 1 && Math.abs(arrInt[candidate - 1] + arrInt[i]) < MAXNUM ) {
                MAXNUM = Math.abs(arrInt[candidate - 1] + arrInt[i]);
                v1 = arrInt[i];
                v2 = arrInt[candidate - 1];
            }
        }

        sb.append(v1).append(" ").append(v2);
        System.out.println(sb);
    }

    static int lower_Bound(int[] arr, int L, int R, int X) {
        while (L < R) {
            int mid = (L + R) / 2;
            if (arr[mid] >= X) {
                R = mid;
            } else {
                L = mid + 1;
            }
        }
        return L;
    }
}
