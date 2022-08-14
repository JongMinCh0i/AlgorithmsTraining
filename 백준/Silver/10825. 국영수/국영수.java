package PS;

import java.io.*;
import java.util.*;

public class Boj10825 {
    static int cnt;
    static Score[] arrScore;
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
        cnt = Integer.parseInt(br.readLine());

        arrScore = new Score[cnt];

        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int lang = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            arrScore[i] = new Score(name, lang, eng, math);
        }
    }

    static void logic() {
        Arrays.sort(arrScore);
        for (int i = 0; i < cnt; i++) {
            sb.append(arrScore[i].name).append('\n');
        }
        System.out.println(sb);
    }

    static class Score implements Comparable<Score> {
        String name;
        int lang, eng, math;

        // constructor
        public Score(String name, int lang, int eng, int math) {
            this.name = name;
            this.lang = lang;
            this.eng = eng;
            this.math = math;
        }

        // 리턴 값 반환
        @Override
        public int compareTo(Score other) {
            if (other.lang == this.lang && other.eng == this.eng && this.math == other.math) {
//                return this.name.charAt(0) - other.name.charAt(0); // 오름차순 (첫번째 문자만 비교하기에 틀림)
                 return this.name.compareTo(other.name);
                // return other.name.compareTo(this.name); 내림차순

            } else if (other.eng == this.eng && other.lang == this.lang) {
                return other.math - this.math;
            } else if (other.lang == this.lang) {
                return this.eng - other.eng;
            }
            return other.lang - this.lang;
        }
    }
}
