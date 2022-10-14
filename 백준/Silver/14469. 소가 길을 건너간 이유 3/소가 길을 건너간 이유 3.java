import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int N, ans;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arrWait[] arr = new arrWait[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            arr[i] = new arrWait(N, M);
        }

        Arrays.sort(arr);

        // 1번소가 대기하고 있을 때 도착 + 대기
        ans = arr[0].arr + arr[0].wait;


        for (int i = 0; i < N - 1; i++) {

            // 2번소 도착시간이 1번소 (도착 + 대기) 보다 느릴경우
            if (ans < arr[i + 1].arr) {
                ans = arr[i + 1].arr;
                ans += arr[i + 1].wait;

            } else {

                ans += arr[i + 1].wait;
            }
        }

        if (N == 1)  ans = arr[0].arr + arr[0] .wait;
        System.out.print(ans);
    }

    static class arrWait implements Comparable<arrWait> {
        int arr;
        int wait;

        public arrWait(int arr, int wait) {
            this.arr = arr;
            this.wait = wait;
        }

        @Override
        public int compareTo(arrWait other) {
            return this.arr - other.arr;
        }
    }
}
