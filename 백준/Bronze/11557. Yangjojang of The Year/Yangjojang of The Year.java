import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int TC, N;
    static Univer[] arr;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        TC = Integer.parseInt(br.readLine());
        for (int i = 0; i < TC; i++) {
            input();
            System.out.print(sb);
        }
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new Univer[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            arr[i] = new Univer(name, num);
        }

        Arrays.sort(arr);

        sb.append(arr[N - 1].name).append('\n');
    }

    static class Univer implements Comparable<Univer> {
        public String name;
        public int num;

        public Univer(String name, int num) {
            this.name = name;
            this.num = num;
        }

        public int compareTo(Univer other) {
            return this.num - other.num;
        }
    }
}