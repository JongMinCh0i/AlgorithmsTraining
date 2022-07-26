import java.io.*;
import java.util.*;

public class Main {
    static int N, M, X, Y; // 가로,세로  , 잡야할 적의 수 , 현재위치 (X,Y), 잡아야하는 말의 위치 (E_X, E_Y)
    static BufferedReader br;
    static StringTokenizer st;
    static int[][] dist;  // 거리
    static int[][] check = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    public static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        // 가로 세로
        N = Integer.parseInt(st.nextToken());

        // 적의 갯수
        M = Integer.parseInt(st.nextToken());

        // 현재 나이트의 위치
        st = new StringTokenizer(br.readLine());

        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        dist = new int[N + 1][N + 1];
    }

    public static void logic() throws IOException {
        bfs();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int E_X = Integer.parseInt(st.nextToken());
            int E_Y = Integer.parseInt(st.nextToken());
            System.out.print(dist[E_X][E_Y] + " ");
        }
    }

    // dist 배열 -1로 초기
    public static void bfs() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                dist[i][j] = -1;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        dist[X][Y] = 0;
        queue.add(X);
        queue.add(Y);

        while (!queue.isEmpty()) {
            int x = queue.poll();
            int y = queue.poll();

            for (int k = 0; k < 8; k++) {
                int dx = x + check[k][0];
                int dy = y + check[k][1];
                if (dx < 1 || dy < 1 || dx > N || dy > N) continue;
                if (dist[dx][dy] != -1) continue;

                queue.add(dx);
                queue.add(dy);

                dist[dx][dy] = dist[x][y] + 1; // why?
            }
        }
    }
}