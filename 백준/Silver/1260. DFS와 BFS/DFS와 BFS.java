import java.io.*;
import java.util.*;

public class Main {
    static int N, M, V;
    static boolean[] visit;
    static ArrayList<Integer>[] arrayLists;
    static StringBuilder sb;

    public static void dfs(int i) {
        visit[i] = true; // 해당 i 방문 처리
        sb.append(i).append(' ');

        for (int y : arrayLists[i]) { // y 가 arrLists[i]를 전부 탐색한다.
            if (visit[y]) {           // 그 과정에서 y가 이미 방문했었더라면
                continue;             // continue; 다시 반목문으로 돌아간다.
            }
            dfs(y);                   // dfs(y) 재귀 처리
        }
    }

    public static void bfs(int strat) {
        Queue<Integer> queue = new LinkedList<>();

        // enqueue 시 visit 처리
        queue.add(strat);
        visit[strat] = true;

        // queue 가 비어있다 = 탐색 완료 / queue의 사이즈가 1 이상이다.= 탐색 중
        while (!queue.isEmpty()) { // 더 이상 확인 할 점이 없다면 정지
            int x = queue.poll();

            sb.append(x).append(' ');

            for (int y : arrayLists[x]) {
                // 이미 방문했다면 continue 처리
                if (visit[y]) continue;

                // enqueue 시 visit 처리
                queue.add(y);
                visit[y] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        arrayLists = new ArrayList[N + 1];
        visit = new boolean[N + 1];

        // 각각의 노드 수 만큼 리스트 생성 1 부터 시작하기에 초기 idx = 1
        for (int i = 1; i <= N; i++) {
            arrayLists[i] = new ArrayList<>();
        }

        // input
        // 인정리스트를 만든다.
        for (int i = 0; i < M; i++) {
            // ex) 1 2 : 1번 노드가 2번 노드와 연결된다고 했을 때
            // 2번 노드 또한 1번 노드와 연결된다는 것이 성립한다.
            // 즉 arr[1] = 2 /  arr[2] = 1 성립한다는 것

            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arrayLists[x].add(y);
            arrayLists[y].add(x);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(arrayLists[i]);
        }

        dfs(V);
        sb.append('\n');
        // visit 배열 초기화
        for (int i = 1; i <= N; i++) {
            visit[i] = false;
        }
        bfs(V);
        System.out.println(sb);
    }
}

