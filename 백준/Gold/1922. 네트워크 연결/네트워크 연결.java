import java.io.*;
import java.util.*;

public class Main {
    static int[][] adjMatrixs;    // 비용 인접 행렬 graph
    static int[] parentNode;      // 0 ~ 8 parentNode
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    //    static final int N = 9, E = 14; // Node , Edge
    static int N, E;
    static int weightCnt;          // 가중치의 최종 합

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        parentNode = new int[N + 1];
        for (int i = 1; i <= N; i++) parentNode[i] = i;

        adjMatrixs = new int[E][3];

        /*
            [edge][0] = startNode
            [edge][1] = endNode
            [edge][2] = weight
        */

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            adjMatrixs[i][0] = Integer.parseInt(st.nextToken());
            adjMatrixs[i][1] = Integer.parseInt(st.nextToken());
            adjMatrixs[i][2] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(adjMatrixs, Comparator.comparingInt(weight -> weight[2])); // 가중치 낮은 순 정렬
    }

    static void logic() {
        for (int[] adjMatrix : adjMatrixs) {
            if (union(adjMatrix[0], adjMatrix[1])) {    // 연결했으면
                weightCnt += adjMatrix[2];              // 비용값 더함
            }
        }

        sb.append(weightCnt);


        System.out.println(sb);
    }

    // 가중치를 갖는 union
    public static boolean union(int start, int end) {
        int startNode = find(start);
        int endNode = find(end);

        if (startNode != endNode) {
            parentNode[startNode] = endNode;
            return true;
        }
        return false;
    }

    // 붕괴법칙을 사용
    public static int find(int x) {
        if (x == parentNode[x]) return x;
        return parentNode[x] = find(parentNode[x]);
    }
}