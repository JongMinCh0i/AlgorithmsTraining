import java.io.*;
import java.util.*;

// 중복 없이, (2, 2) X
// 오름 차순 (1, 2), (2,3)

public class Main {

    static StringBuilder sb;
    static StringTokenizer st;
    static BufferedReader br;
    static int N, M;
    static int[] answer, used;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        answer = new int[M];
        used = new int[N + 1];

        rec_fun(0, 1);
        System.out.println(sb);
    }

    public static void rec_fun(int k, int next) {
        // 조건에 맞는 탐색을 1개라도 성공했을 때
        if (k == M) {
            for (int i = 0; i < answer.length; i++) {
                sb.append(answer[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        // 오름차순, 중복 없이
        // cand 번 째 부터 M번째 원소를 조건에 맞게 고르는 모든 방법 시도.
        for (int cand = next; cand <= N; cand++) {
            if (used[cand] == 1) continue;

            answer[k] = cand; // 0번에 1번 사용
            used[cand] = 1; // 1번 사용
            rec_fun(k + 1, cand + 1);
            used[cand] = 0;
        }
    }
}
