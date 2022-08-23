package PS;

// 내가 이진탐색 돌릴 배열을 우선 정렬하고 이분탐색을 실행한다.
// LowerBound를 실행한 이유는 내가 목표로 잡은 값 이하의 수가 통과한다면 이미 정렬된 배열에선 해당 통과한 값 보다 작은 값은
// 반드시 통과 될 것을 알고 있기 때문이다.
// 이분 탐색을 돌릴 해당 배열은 우선 정렬되어 있어야 한다. 정렬 범위의 경우 1부터 값을 넣었기에 정렬 범위 또한 지정해서 실행해야한다.
// 가급적 가능하다면 배열의 길이를 범위로 잡지 말 것

import java.io.*;
import java.util.*;

class Boj7795 {
    static int TC, N, M;
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int[] A, B;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        TC = Integer.parseInt(br.readLine());

        for (int i = 0; i < TC; i++) {
            input();
            logic();
        }
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N + 1];
        B = new int[M + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            A[i] = num;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            int num = Integer.parseInt(st.nextToken());
            B[i] = num;
        }
    }

    static void logic() throws IOException {
        int ans = 0;

        Arrays.sort(B, 1, M + 1);

        for (int i = 1; i <= N; i++) {
            // 이분탐색을 실행할 배열 B 배열 L 은 1부터 시작 , R은 M까지 시작
            // 비교할 값은 A[i]로 선택
            ans += lowerBound(B, 1, M, A[i]);
        }

        System.out.println(ans);
    }

    // 정렬되어 있는 대상 배열 int[] arr
    // L은 arr의 시작 지점
    // R은 arr의 끝
    static int lowerBound(int[] arr, int L, int R, int X) {
        int result = L - 1;

        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] < X) {
                result = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return result;
    }
}
