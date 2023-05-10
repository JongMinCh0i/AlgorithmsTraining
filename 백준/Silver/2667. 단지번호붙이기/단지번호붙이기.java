import java.io.*;
import java.util.*;

public class Main {
    static int N, groupCnt;
    static int[][] check = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}}; // 상하좌우
    static String[] arr;
    static boolean[][] visit;
    static ArrayList<Integer> arrayList;
    static StringBuilder sb;

    static void dfs(int i, int j) {
        groupCnt++;

        visit[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int dx = i + check[k][0];
            int dy = j + check[k][1];

            if (dx < 0 || dy < 0 || dx >= N || dy >= N) continue;
            if (visit[dx][dy]) continue;
            if (arr[dx].charAt(dy) == '0') continue;


            dfs(dx, dy);
        }
    }

    static void logic() {
        arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j] && arr[i].charAt(j) == '1') {
                    groupCnt = 0;
                    dfs(i, j);
                    arrayList.add(groupCnt);
                }
            }
        }

        Collections.sort(arrayList);
        sb.append(arrayList.size()).append('\n');
        for (int cnt : arrayList) {
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new String[N];

        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        logic();
    }
}