import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int A = Integer.parseInt(br.readLine());
        // Score 배열을 A 만큼 생성
        Score[] scores = new Score[A];
        // Input
        for (int i = 0; i < A; i++) {
            st = new StringTokenizer(br.readLine());
            scores[i] = new Score(st.nextToken(), Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        // 정렬
        Arrays.sort(scores);
        for (int i = 0; i < A; i++) {
            sb.append(scores[i].str).append('\n');
        }
        System.out.println(sb);
    }

    static class Score implements Comparable<Score> {
        String str;
        int langScore, mathScore, engScore;

        // 초기화
        public Score(String str, int langScore, int engScore, int mathScore) {
            this.str = str;
            this.langScore = langScore;
            this.engScore = engScore;
            this.mathScore = mathScore;
        }

        // 정렬 조건 제시
        @Override
        public int compareTo(Score o) {
            if (this.langScore != o.langScore) {
                return o.langScore - this.langScore;
            }
            if (this.engScore != o.engScore) {
                return this.engScore - o.engScore;
            }
            if (this.mathScore != o.mathScore) {
                return o.mathScore - this.mathScore;
            }
            return str.compareTo(o.str);
        }
    }
}