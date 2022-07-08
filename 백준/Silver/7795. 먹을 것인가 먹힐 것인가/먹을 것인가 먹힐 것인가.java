import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int T, N, M;
    static int cnt = 0;
    static int[] NList, RList;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            NList = new int[N + 1];
            RList = new int[M + 1];

            addLeftList();
            addRightList();
            logic();
        }
    }

    static void addLeftList() throws IOException {
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            NList[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void addRightList() throws IOException {
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            RList[i] = Integer.parseInt(st.nextToken());
        }
    }

    static int lower_bound(int[] arr, int N) {

        int L = 1;
        int R = RList.length - 1;

        int res = 0; // L - 1인 이유는 아무런 값이 없을 경우 자기 자신을 돌리게 하기 위해서

        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] < N) {
                res = mid; // res 결과 값 res 아래로는 다 허용 된다는 뜻
                L = mid + 1;
            } else if (arr[mid] >= N) {
                R = mid - 1;
            }
        }
        return res;
    }

    static void logic() {
        cnt = 0;

        Arrays.sort(RList, 1, M + 1);

        for (int i = 1; i <= N; i++) {

            cnt += lower_bound(RList, NList[i]);
        }

        System.out.println(cnt);
    }
}