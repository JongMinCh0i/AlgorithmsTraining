import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int[] temp, selected, origin, sorted;
    static boolean[] checked;
    static int N, M;

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
        temp = new int[N];
        checked = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(temp);
    }

    static void rec_fun(int k) {
        if (k == M) {
            // 정렬을 했을 때 두 수의 위치가 바뀐다면 return; 처리

            sorted = selected.clone();

            Arrays.sort(sorted);

            for (int i = 0; i < sorted.length; i++) {
                if (selected[i] != sorted[i]) {
                    return;
                }
            }

            for (int i = 0; i < M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for (int i = 0; i < N; i++) {
                if (!checked[i]) {
                    selected[k] = temp[i];
                    checked[i] = true;
                    rec_fun(k + 1);
                    checked[i] = false;
                }
            }
        }
    }
}
