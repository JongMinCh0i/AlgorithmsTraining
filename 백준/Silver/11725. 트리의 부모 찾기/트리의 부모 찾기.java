import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static boolean[] visit;
    static ArrayList<Integer>[] arr;
    static int[] parent;
    static StringTokenizer st;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new ArrayList[N + 1];
        visit = new boolean[N + 1];
        parent = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }


        for (int i = 0; i < N - 1; i++) { // 1을 제외하고 입력
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            
            // 무방향 그래프이기에 각 간선 추가 !! 
            arr[idx].add(value);
            arr[value].add(idx);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visit[start] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int y : arr[x]) {
                if(visit[y]) continue;

                queue.add(y);
                parent[y] = x; // 1번 부터 시작해서 첫번째 시작하는 다음 정점 입력
                visit[y] = true;
            }
        }
    }

    static void logic() {
        bfs(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }
}
