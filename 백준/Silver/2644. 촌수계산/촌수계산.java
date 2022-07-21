import java.io.*;
import java.util.*;

public class Main {
    static int People, start, end, amount;
    static ArrayList<Integer>[] arr;
    static int[] dist;
    static BufferedReader br;
    static StringTokenizer st;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        People = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        amount = Integer.parseInt(br.readLine());

        arr = new ArrayList[People + 1];
        dist = new int[People + 1];

        for (int i = 1; i <= People; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < amount; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            arr[idx].add(value);
            arr[value].add(idx);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        // 초기값을 -1로 채워서 해당 예외 케이스 경우 -1 출력
        for (int i = 1; i < dist.length; i++) dist[i] = -1;

        queue.add(start);
        dist[start]++;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int y : arr[x]) {
                if (dist[y] != -1) continue;

                queue.add(y);
                dist[y] = dist[x] + 1;
            }
        }
    }

    public static void logic() {
        bfs(start);
    }

    public static void main(String[] args) throws IOException {
        input();
        logic();
        System.out.println(dist[end]);
    }
}

