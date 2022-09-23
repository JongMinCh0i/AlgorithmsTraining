import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int A[], A_exist[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        // 엔터를 기준으로 받습니다
        br = new BufferedReader(new InputStreamReader(System.in));
        // 첫번 째 엔터를 받은 문자열을 숫자로 변환합니다.
        N = Integer.parseInt(br.readLine());
        // 다음 엔터를 통해서 받은 문자열을 공백을 기준으로 분리합니다.
        st = new StringTokenizer(br.readLine());
        // 숫자로 변환했던 수 만큼의 int[] 사이즈를 설정합니다.
        A = new int[N];

        // 공백을 기준으로 분리했던 문자열을 숫자로 변환해서 배열에 추가했습니다.
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());
        A_exist = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            A_exist[i] = Integer.parseInt(st.nextToken());
        }
    }

    static int lower_bound(int A[], int L, int R, int A_exist) {
        while (L < R) {
            int mid = (L + R) / 2;
            if (A[mid] >= A_exist) {
                R = mid;
            } else {
                L = mid + 1;
            }
        }
        return R;
    }

    static int upper_bound(int A[], int L, int R, int A_exist) {
        while (L < R) {
            int mid = (L + R) / 2;
            if (A[mid] > A_exist) {
                R = mid;
            } else {
                L = mid + 1;
            }
        }
        return R;
    }

    static void logic() {
        Arrays.sort(A);

        for (int i = 0; i < M; i++) {
            sb.append(upper_bound(A, 0, A.length, A_exist[i]) - lower_bound(A, 0, A.length, A_exist[i])).append(" ");
        }
        System.out.println(sb); // 출력값 : 7 0 0 3 0 0 0 0 / 정상적인 출력값 : 3 0 0 1 2 0 0 2
    }
}