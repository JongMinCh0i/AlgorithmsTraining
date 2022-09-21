import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb;
    static StringTokenizer st;
    static BufferedReader br;
    static int N;

    static testForArr[] arr2;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr2 = new testForArr[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int Korean = Integer.parseInt(st.nextToken());
            int English = Integer.parseInt(st.nextToken());
            int Math = Integer.parseInt(st.nextToken());
            arr2[i] = new testForArr(name, Korean, English, Math);
        }

        Arrays.sort(arr2); // 정렬
    }

    static void logic() {
        for (int i = 0; i < N; i++) {
            sb.append(arr2[i].name).append('\n');
        }

        System.out.println(sb);
    }


    static class testForArr implements Comparable<testForArr> {
        String name;
        int Korean, English, Math;

        public testForArr(String name, int Korean, int English, int Math) {
            this.name = name;
            this.Korean = Korean;
            this.English = English;
            this.Math = Math;
        }

        @Override
        public int compareTo(testForArr other) {
            if (other.Korean == this.Korean) {
                if (other.English == this.English) {
                    if (other.Math == this.Math) {
                        return this.name.compareTo(other.name);
                    }
                    return Integer.compare(other.Math, this.Math);
                }
                return Integer.compare(this.English, other.English);
            }
            return Integer.compare(other.Korean, this.Korean);
        }
    }
}
