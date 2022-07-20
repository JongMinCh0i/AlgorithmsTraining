import java.io.*;
import java.util.*;

public class Main {
    static int N, M, cnt; // 가로, 세로
    static int[][] check = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
    static int[][] map;
    static boolean[][] visit;
    static StringTokenizer st;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            st = new StringTokenizer(br.readLine());

            // 가로 세로 확실히 숙지하고 풀기
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            if (N == 0 && M == 0) break;

            // N * M
            map = new int[N][M];
            visit = new boolean[N][M];
            // 초기화
            cnt = 0;

            // 가로 0번쨰 부터 시작
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                // 세로 0번째 부터 시작
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            logic();
        }
    }


    static void logic() {

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

    static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int k = 0; k < 8; k++) {
            int dx = x + check[k][0];
            int dy = y + check[k][1];

            // 첫번째 해당 범위 확인 
            if (dx < 0 || dy < 0 || dx >= N || dy >= M) continue; 
            // 방문 여부 확인 
            if (visit[dx][dy]) continue;
            // 방문 가능 여부 확인 
            if (map[dx][dy] == 0) continue;
            
            dfs(dx, dy);
        }
    }
}