import java.io.*;
import java.util.*;

class Main {
    static int N, M;
    static long[] arr;
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new long[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
    }

    // 정답인 H를 파리미터에 넣음
    static boolean determination(int H) {
        // H 높이로 나무들을 잘랐을 때, M 만큼을 얻을 수 있으면 true, 없으면 false 리턴
        long sum = 0;
        for (int i = 0; i < N; i++) {
            // 잘리는 조건
            if (arr[i] > H) {
                // H 높이에 잘릴 경우 잘린 합을 sum에 합한다.
                sum += arr[i] - H;
            }
        }

        // 가능?
        if (sum >= M) {
            return true;
        } else {
            return false;
        }
        
        
    }

    static void logic() {
        long L = 1, R = 2000000000, ans = 0;
        // [L....R] 범위 안에 정답이 존재 한다.
        // 이분 탐색과 determination 활용해서 answer 구하기

        Arrays.sort(arr);

        while (L <= R) {
            int mid = (int) ((L + R) / 2);
            if (determination(mid)) {
                ans = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        System.out.println(ans);
    }
}