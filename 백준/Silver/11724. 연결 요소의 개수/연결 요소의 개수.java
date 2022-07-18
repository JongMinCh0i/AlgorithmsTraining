import java.io.*;
import java.util.*;

// 어떨때 array + 1 하는지 이상인지 초과인지 정하는 지 다 적어놓기

public class Main {
    static int N, M, cnt;
    static ArrayList<Integer>[] arrayLists;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   // 정점
        M = Integer.parseInt(st.nextToken());   // 간선

        // 정점 + 1
        // why? 정점의 갯수가 1부터 시작한다.  N : 4 = 1,2,3,4,5
        // boolean 배열의 사이즈와 정점의 갯수와 일치시킨다.
        visit = new boolean[N + 1];

        // 왜 + 1?
        arrayLists = new ArrayList[N + 1];

        // 정점의 갯수가 1부터 시작하기에 이상으로 처리
        for (int i = 1; i <= N; i++) {arrayLists[i] = new ArrayList<>();}

        // input 
        // 1번 정점 부터 시작해서 M 횟수까지 입력받는다. 
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            // 방향이 없는 무방향 그래프 이기에 start -> end (0) , end -> start(0) 가능
            arrayLists[start].add(end);
            arrayLists[end].add(start);
        }

        // 1번 정점 부터 시작해서 끝까지
        for (int i = 1; i <= N; i++) {
            // 아직 visit에서 false인 인덱스는 dfs실행
            if (!visit[i]) {
                cnt++;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }

    static void dfs(int i) {

        visit[i] = true;

        for (int y : arrayLists[i]) {
            if (visit[y]) continue;

            dfs(y);
        }
    }
}