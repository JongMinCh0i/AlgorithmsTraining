import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] A;

    static int findNum(int[] A, int key) {
        int L = 1;
        int R = A.length - 1;

        while (L <= R) {
            int mid = (L + R) / 2;
            if (key == A[mid]) {
                return 1;
            } else if (A[mid] < key) {
                L = mid + 1;
            } else if (A[mid] > key) {
                R = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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

        for (int i = 1; i <= M; i++) {
            int n = Integer.parseInt(st.nextToken());
            System.out.print(findNum(A, n) + " ");
        }
    }
}