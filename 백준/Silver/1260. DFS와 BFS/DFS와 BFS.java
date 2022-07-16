import java.io.*;
import java.util.*;

public class Main {
    static int V, E, start;
    static boolean[] visit;
    static ArrayList<Integer>[] arr;
    static StringBuilder sb;

    static void dfs(int x) {
        visit[x] = true;
        sb.append(x).append(' ');

        for (int y : arr[x]) {
            if (visit[y]) {
                continue;
            }
            dfs(y);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visit[start] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            sb.append(x).append(' ');

            for (int y : arr[x]) {
                if (visit[y])
                    continue;

                queue.add(y);
                visit[y] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        V = Integer.parseInt(st.nextToken());   // V
        E = Integer.parseInt(st.nextToken());   // E
        start = Integer.parseInt(st.nextToken());   // Start
        arr = new ArrayList[V + 1];
        visit = new boolean[V + 1];

        for (int i = 1; i <= V; i++) {
            arr[i] = new ArrayList<>();
        }


        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x].add(y);
            arr[y].add(x);
        }

        for (int i = 1; i <= V; i++) {
            Collections.sort(arr[i]);
        }


        dfs(start);
        sb.append('\n');
        for (int i = 1; i <= V; i++) {
            visit[i] = false;
        }
        bfs(start);
        System.out.println(sb);
    }
}