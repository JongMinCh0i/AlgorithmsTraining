import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static Queue<Integer> idx;
    static Queue<Integer> pri;
    static int N, M, T;
    static int cnt;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            input();
            logic();
        }
    }

    static void input() throws IOException {
        idx = new LinkedList<>();
        pri = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int priNum = Integer.parseInt(st.nextToken());

            idx.add(i);
            pri.add(priNum);
        }
    }

    // 출력할 수 있는 조건 : 해당 큐의 최댓값이 제일 앞에 있을 때
    // 정답을 찾는 조건 : 원하는 값 (M)이 출력되었을 때 해당 순서를 출력 할 때
    static void logic() {
        // 되도록 cnt는 전역으로 처리하기 보단 지역변수로 처리 
        cnt = 1;
        while (!idx.isEmpty()) {

            int max = Collections.max(pri);
            int cur = pri.poll();
            int cur_idx = idx.poll();

            // 뽑기 확정
            if (max == cur) {
                if (cur_idx == M) {
                    System.out.println(cnt);
                }
                cnt++;
            } else {
                pri.add(cur);
                idx.add(cur_idx);
            }
        }
    }
}