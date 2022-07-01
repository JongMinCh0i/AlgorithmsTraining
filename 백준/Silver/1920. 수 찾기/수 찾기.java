import java.io.*;
import java.util.*;

public class Main {
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

        for (int i = 1; i <= M; i++) {
            int n = Integer.parseInt(st.nextToken());
            System.out.println(binarySearch(A, n));
        }
    }

    public static int binarySearch(int[] arr, int A) {
        int L = 1;
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