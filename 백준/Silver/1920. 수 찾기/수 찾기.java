package PS;

import java.io.*;
import java.util.*;

public class Boj1920 {
    static int N, M;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        A = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        // A 배열에 값 입력
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // A 배열 1부터 N + 1까지 정렬
        Arrays.sort(A, 1, N + 1);

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());


        // M까지가 아닌 N까지로 하여 문제 발생
        for (int i = 1; i <= M; i++) {
            int n = Integer.parseInt(st.nextToken());
            System.out.println(binarySearch(A, n));
        }
    }

    public static int binarySearch(int[] arr, int A) {
        int L = 1;

        // R = arr.length 라 하여 문제 발생
        // R의 초기값은 길이 -1 로 하여야 한다.
        // 그러지 않을 경우 mid의 값이 길이가 되어 index 초과 발생

        int R = arr.length - 1;

        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == A) {
                return 1;
            } else if (arr[mid] < A) {
                L = mid + 1;
            } else if (arr[mid] > A) {
                R = mid - 1;
            }
        }
        return 0;
    }
}
