import java.io.*;
import java.util.*;

public class Main {
    static int N, X, Y, move_X, move_Y; // N (가로,세로), 현재 나이트의 위치 (X,Y)
    static BufferedReader br;
    static StringTokenizer st;
    static int[][] dist;  // 거리
    static int[][] check = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            input();
            logic();
        }

        System.out.println(sb);
    }

    public static void input() throws IOException {

        // 가로 세로
        N = Integer.parseInt(br.readLine());

        // 거리
        dist = new int[N + 1][N + 1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                dist[i][j] = -1;
            }
        }

        // 현재 나이트의 위치
        st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        // 이동해야 하는 거리 탐색
        st = new StringTokenizer(br.readLine());
        move_X = Integer.parseInt(st.nextToken());
        move_Y = Integer.parseInt(st.nextToken());
    }

    public static void logic() throws IOException {
        bfs();
        sb.append(dist[move_X][move_Y]).append('\n');
    }

    // dist 배열 -1로 초기
    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(X);
        queue.add(Y);

        dist[X][Y] = 0;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            int y = queue.poll();

            for (int k = 0; k < 8; k++) {
                int dx = x + check[k][0];
                int dy = y + check[k][1];

                if (dx < 0 || dy < 0 || dx > N || dy > N) continue;
                if (dist[dx][dy] != -1) continue;

                queue.add(dx);
                queue.add(dy);

                dist[dx][dy] = dist[x][y] + 1;
            }

        }
    }
}
