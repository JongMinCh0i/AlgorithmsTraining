import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map, dist;
    static boolean[][] visit;
    static BufferedReader br;
    static StringTokenizer st;
    static int[][] check = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    public static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        dist = new int[N][M];
        visit = new boolean[N][M];

        // 새로운 입력 방법
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
    }

    public static void logic() {
        // x : 0 y : 0 부터 시작해서
        bfs(0, 0);

        // N -1 M - 1 출력 
        System.out.println(dist[N - 1][M - 1]);
    }

    // 왜 dfs가 아니라 bfs일까?
    public static void bfs(int x, int y) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                dist[i][j] = -1;
            }
        }

        queue.add(x);
        queue.add(y);
        dist[x][y] = 1;
        visit[x][y] = true;

        while (!queue.isEmpty()) {
            x = queue.poll();
            y = queue.poll();

            for (int k = 0; k < 4; k++) {
                int dx = x + check[k][0];
                int dy = y + check[k][1];

                if (dx < 0 || dy < 0 || dx >= N || dy >= M) continue;
                if (visit[dx][dy]) continue;
                if (map[dx][dy] == 0) continue;

                queue.add(dx);
                queue.add(dy);
                visit[dx][dy] = true;
                dist[dx][dy] = dist[x][y] + 1;
            }
        }
    }
}