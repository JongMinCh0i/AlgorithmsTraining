import java.io.*;
import java.util.*;

import static java.lang.Double.compare;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N;
    static ArrayList<Man> mans;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        mans = new ArrayList<>();

        while (true) {
            N = Integer.parseInt(br.readLine());

            if (N == 0) {
                System.out.print(sb);
                break;
            }

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                double length = Double.parseDouble(st.nextToken());

                mans.add(new Man(name, length));
            }

            logic();
            mans.clear();
        }
    }

    static class Man implements Comparable<Man> {
        String name;
        double length;

        public Man(String name, double length) {
            this.name = name;
            this.length = length;
        }

        @Override
        public int compareTo(Man other) {
//            return (int) (other.length - this.length);
            // 1번 예제에서 올바른 값이 나오지 않는다.
            return compare(other.length, this.length);
        }
    }

    static void logic() {
        Collections.sort(mans);

        if (N == 1) {
            sb.append(mans.get(0).name);
            return;
        }

        // 같은 키 일 때 처리
        for (int i = 0; i < N - 1; i++) {
            double first_length = mans.get(i).length;
            double sencond_length = mans.get(i + 1).length;

            if (first_length == sencond_length) {
                sb.append(mans.get(i).name).append(" ");
                sb.append(mans.get(i + 1).name).append(" ");
                i++;

                if (i >= N) {
                    break;
                }
            } else {
                sb.append(mans.get(i).name);
                sb.append('\n');
                return;
            }
        }
    }
}
