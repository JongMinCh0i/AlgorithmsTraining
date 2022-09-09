// v1 = left v2 = right 가 된다.
// v1 과 v2의 최적의 해는 -v1 일 것이다.
// 해당 수가 0에 더 가깝기에 그것이 정해가 될 것
// Hint : LowerBound(int[] arr, int L, int R, int X)
// LowerBound(arr, L + 1, int R, arr[i] * -1) 해당 범위 설정의 이유는?

import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, v1, v2;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void logic() {
        Arrays.sort(arr);
        v1 = 0;
        v2 = 0;
        int bigN = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int candidate = lowerBound(arr, i + 1, N, arr[i] * -1);

            if (i < candidate - 1 && Math.abs(arr[i] + arr[candidate - 1]) < bigN) {
                bigN = Math.abs(arr[i] + arr[candidate - 1]);

                v1 = arr[i];
                v2 = arr[candidate - 1];
            }

            if (candidate < N &&  Math.abs(arr[i] + arr[candidate]) < bigN) {
                bigN = Math.abs(arr[i] + arr[candidate]);
                v1 = arr[i];
                v2 = arr[candidate];
            }
        }

        sb.append(v1).append(" ").append(v2);
        System.out.println(sb);
    }


    static int lowerBound(int[] arr, int L, int R, int X) {
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