import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] A;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A, 1, N + 1);
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        // 1부터 M까지 이분탐색 실행
        for (int i = 1; i <= M; i++) {
            int n = Integer.parseInt(st.nextToken());
            findNum(A, n);
        }
        System.out.println(sb);
    }
    // 이분탐색 코드
    static void findNum(int[] A, int key) {
        int L = 1;
        int R = A.length - 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (key == A[mid]) {
                sb.append("1").append(" ");
                return;
            } else if (A[mid] < key) {
                L = mid + 1;
            } else if (A[mid] > key) {
                R = mid - 1;
            }
        }
        sb.append("0").append(" ");
    }
}
