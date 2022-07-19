import java.io.*;
import java.util.*;

public class Main {
    static int N, M, cnt;
    static boolean[] visit;
    static ArrayList<Integer>[] arrayLists;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        visit = new boolean[N + 1];
        arrayLists = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            arrayLists[i] = new ArrayList<>();
        }

        // input
        for (int i = 1; i <= M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arrayLists[x].add(y);
            arrayLists[y].add(x);
        }

        bfs(1);
    }

    public static void bfs(int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visit[i] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            cnt++;
            for (int y : arrayLists[x]) {
                if (visit[y]) continue;

                queue.add(y);
                visit[y] = true;
            }
        }
        System.out.println(cnt - 1);
    }
}
