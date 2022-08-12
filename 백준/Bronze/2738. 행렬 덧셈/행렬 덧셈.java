import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static int[][] map2;
    static int[][] ans;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        input();
        logic();

    }

    public static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N + 1][M + 1];
        map2 = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
            }
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                int num = Integer.parseInt(st.nextToken());
                map2[i][j] = num;
            }
        }
    }

    public static void logic() throws IOException {
        ans = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                int A  = map[i][j] + map2[i][j];
                ans[i][j] = A;
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}