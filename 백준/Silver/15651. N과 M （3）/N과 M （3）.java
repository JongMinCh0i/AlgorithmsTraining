import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] selected; 

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        selected = new int[M + 1]; // k == M + 1 접근할 경우 종료

        rec_func(1);
        System.out.println(sb.toString());
    }

    // Recurrence Function (재귀 함수)
    // k = index; k가 M + 1에 닿으면 종료 후 출력
    // k = index; k가 M + 1에 닿기 전에는  selected[k] = cand; & rec_func(k + 1); 다음 인덱스로 접근

    static void rec_func(int k) {
        if (k == selected.length) {
            for (int i = 1; i <= M; i++)
                sb.append(selected[i]).append(' '); // 값의 호출
            sb.append('\n');
        } else {
            for (int cand = 1; cand <= N; cand++) { // cand 는 1부터 시작
                selected[k] = cand;                 // 값의 입력
                rec_func(k + 1);
            }
        }
    }
}