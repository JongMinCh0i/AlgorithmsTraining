import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static int[] arrInt;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arrInt = new int[N];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arrInt[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(arrInt);
        for (int i = 0; i < N; i++) {
            sb.append(arrInt[i]).append('\n');
        }

        System.out.println(sb);

    }
}