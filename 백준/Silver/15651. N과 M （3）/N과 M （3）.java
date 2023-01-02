import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int[] selected;

    public static void main(String[] args) throws IOException {
        input();
        rec_fun(0);
        System.out.println(sb);
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        selected = new int[M];
    }

    static void rec_fun(int k) { // 현재까지 K개 까지 수를 택했음
        if (k == M) {            // M개를 모두 택했으면 (Base Condition)
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" "); // selected 에 기록해둔 수를 출력
            }
            sb.append('\n');
        } else {
            // 1 ~ N 까지를 k 번 원소로 한 번씩 정하고,
            // 다음 수를 정하러 한 단계 더 들어감 (k는 selected의 다음 IDX를 선택함 , 값의 변화는 for문에서 이뤄짐)
            for (int i = 1; i <= N; i++) {
                selected[k] = i;
                rec_fun(k + 1);
            }
        }
    }
}
