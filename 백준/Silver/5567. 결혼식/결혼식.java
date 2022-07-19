import java.io.*;
import java.util.*;

public class Main {
    // V , M, Cnt
    static int N, M;
    // 거리 확인용 배열
    static int[] dist;
    // 인접리스트
    static ArrayList<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        // input
        dist = new int[N + 1];
        arr = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dx = Integer.parseInt(st.nextToken());
            int dy = Integer.parseInt(st.nextToken());
            arr[dx].add(dy);
            arr[dy].add(dx);
        }
        System.out.println(bfs(1));
    }
    // start 라는 정점에서 시작해서 결혼식에 올 수 있는 사람 수 찾기
    static int bfs(int start) {
        int result = 0;
        Queue<Integer> que = new LinkedList<>();
        // 방문 여부를 확인 할 가중치 배열을 전부 -1로 초기화 한다.
        for (int i = 1; i <= N; i++) dist[i] = -1;
        // start는 방문 가능한 점이므로 que에 넣어준다.(enqueue)
        que.add(start);
        // 갈 수 있는 start는 0으로 표시
        dist[start] = 0;
        // 더 확인할 점이 없다면 정지
        while (!que.isEmpty()) {
            int x = que.poll();
            // 이해가 안가는 부분
//            if (1 <= dist[x] && dist[x] <= 2) result++;
            // 아래도 맞게 나옴
            if (1 <= dist[x] ) result++;
            // 거리가 2 일 경우 친구의 친구 이기에 continue;
            if (dist[x] == 2) continue;
            // queue에서 꺼낸 x 를 y로 전부 탐색
            for (int y : arr[x]) {
                // x 에서 y 를 갈 수는 있지만, 이미 탐색한 점이면 무시
                // 이미 탐색 했을 경우 값이 -1 이 아닌 0으로 초기화 하기에 -1이면 continue;
                if (dist[y] != -1) continue;
                // y를 갈 수 있으니까 que에 추가하고, visit 처리 하기!
                // y를 갈 수 있는 인덱스는 값이 0으로 초기화 된다.
                // 즉 값이 0일 경우 다시 큐에 넣고 탐색할 가치가 존재한다는 것이다.
                que.add(y);
                // 이해가 안가는 부분
                // enqueue 이후 방문 처리가 어떤 방법인지
                dist[y] = dist[x] + 1;
            }
        }
        return result;
    }
}