import java.io.*;
import java.util.*;

class Main {
    static int[] N, M;
    static int i, j, T;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            input();
            logic();
        }
    }

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        i = Integer.parseInt(st.nextToken());
        j = Integer.parseInt(st.nextToken());

        N = new int[i + 1];
        M = new int[j + 1];

        st = new StringTokenizer(br.readLine());
        for (int k = 1; k <= i; k++) {
            N[k] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int k = 1; k <= j; k++) {
            M[k] = Integer.parseInt(st.nextToken());
        }
    }

    static int lower_bound(int[] arr, int L, int R, int X) {
        // arr[L...R]에서 X 미만의 수 중 제일 오른쪽 인덱스를 return 하는 함수
        // ex) 11,12,34,53 x = 34 , 34미만의 수 11, 12 중 12 리턴
        // 목표 결괏값의 L - 1  == 왼쪽미만에서 가장 오른쪽
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

    static void logic() {
        // M 번 배열의 1번 인데스 부터 J + 1 // 끝까지 정렬한다.
        // 중요 1부터 시작한다.
        Arrays.sort(M, 1, j + 1);

        int cnt = 0;
        for (int k = 1; k <= i; k++) {
            cnt += lower_bound(M, 1, j, N[k]);
        }

        System.out.println(cnt);
    }
}