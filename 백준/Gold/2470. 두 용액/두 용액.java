import java.io.*;
import java.util.*;

class Main {
    static int N;
    static int[] arrInt;
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        arrInt = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arrInt[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(arrInt);
        int bestNum = Integer.MAX_VALUE;
        int v1 = 0;
        int v2 = 0;

        for (int i = 0; i < N; i++) {
            int cand = lower_Bound(arrInt, i + 1, N, arrInt[i] * -1);

            if (i < cand - 1 && Math.abs(arrInt[i] + arrInt[cand - 1]) < bestNum) {
                bestNum = Math.abs(arrInt[i] + arrInt[cand - 1]);
                v1 = arrInt[i];
                v2 = arrInt[cand - 1];
            }
            
            if (cand < N && Math.abs(arrInt[i] + arrInt[cand]) < bestNum) {
                bestNum = Math.abs(arrInt[i] + arrInt[cand]);
                v1 = arrInt[i];
                v2 = arrInt[cand];
            }
        }
        sb.append(v1).append(' ').append(v2);
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