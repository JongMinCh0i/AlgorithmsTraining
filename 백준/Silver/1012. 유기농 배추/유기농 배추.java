import java.io.*;
import java.util.*;

public class Main {
    static int T, N, M, S, cnt;
    static boolean[][] visit;
    static int[][] map;
    static int[][] check = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    static StringTokenizer st;
    static BufferedReader br;

    public static void dfs(int i, int j) {
        visit[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int dx = i + check[k][0];
            int dy = j + check[k][1];
            if (dx < 0 || dy < 0 || dx >= N || dy >= M) continue;
            if (visit[dx][dy]) continue;
            if (map[dx][dy] == 0) {
                continue;
            }
            dfs(dx, dy);
        }
    }

    public static void search() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visit[i][j] && map[i][j] == 1) {
                    cnt++;
                    dfs(i, j);
                }
            }
        }
        System.out.println(cnt);
    }

    public static void input() throws IOException {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        visit = new boolean[N][M];
        map = new int[N][M];

        for (int i = 0; i < S; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
        }
    }


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            input();
            search();
            cnt = 0;
        }
    }
}