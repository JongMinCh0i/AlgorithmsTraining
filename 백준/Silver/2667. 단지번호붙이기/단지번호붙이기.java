import java.io.*;
import java.util.*;

public class Main {
    static int N, group_cnt;
    static String[] a;
    static int[][] check = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}}; // 상 , 하 , 좌, 우 // [4][2]
    static boolean[][] visit;
    static ArrayList<Integer> group;
    static StringBuilder sb;

    // x, y 를 갈 수 있다는 걸 알고 방문한 상태
    static void dfs(int x, int y) {
        // 실행됐음에 cnt++ 발생
        group_cnt++;
        // 해당 [x][y] = true 로 방문 등록
        visit[x][y] = true;

        for (int k = 0; k < 4; k++) {
            int nx = x + check[k][0]; // check 의 x
            int ny = y + check[k][1]; // check 의 y
            // 지도를 벗어나는 곳으로 가는가? // nx, ny가 음수 이며 N 이상일 경우 (범위 초과)
            // N 이상일 경우 에러가 뜨는 이유는  0부터 값을 넣었기에 0부터 6까지가 옳다
            if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            // 갈 수 있는 칸인지 확인해야 한다. 0일 경우 존재하지 않는다.
            if (a[nx].charAt(ny) == '0') continue;
            // 이미 방문한 적이 있는 곳인가?
            if (visit[nx][ny]) continue;
            dfs(nx, ny);
        }
    }

    static void logic() {
        // 탐색 시작
        group = new ArrayList<>();
        // 행과 열 탐색
        // a의 인덱스 탐지
        for (int i = 0; i < N; i++) {
            // a의 인덱스 중 value에 대한 탐지
            for (int j = 0; j < N; j++) {
                // 만약 visit[i][j] = false 이고 해당 행의 열이 1일 경우 탐색 할 가치가 발생
                if (!visit[i][j] && a[i].charAt(j) == '1') {
                    // 그룸 카운트를 0으로 초기화함 (새로운 값을 넣기 위함 )
                    group_cnt = 0;
                    // dfs 탐색
                    dfs(i, j);
                    // 이후 group.add(카운트 한 정보)
                    group.add(group_cnt);
                }
            }
        }

        // 오름차순 정렬
        Collections.sort(group);
        // group 사이즈의 총합을 넣어준다.
        sb.append(group.size()).append('\n');
        // 1부터 시작해서 해당 카운트를 입력
        for (int cnt : group) sb.append(cnt).append('\n');
        // 출력
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        a = new String[N];
        sb = new StringBuilder();
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            // 각 String 배열의 인덱스로 0부터 N까지 입력
            // why ? N * N 이기에 가로, 세로
            a[i] = br.readLine();
        }
        logic();
    }
}
