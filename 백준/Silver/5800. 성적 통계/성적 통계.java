import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N;
    static ArrayList[] arrs;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arrs = new ArrayList[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            arrs[i] = new ArrayList<Integer>();
            for (int j = 0; j < size; j++) {
                arrs[i].add(Integer.parseInt(st.nextToken()));
            }
        }
    }

    static void logic() {

        for (int i = 0; i < N; i++) {
            Collections.sort(arrs[i], Collections.reverseOrder());

            sb.append("Class ").append(i + 1).append('\n');
            sb.append("Max ").append(arrs[i].get(0)).append(",")
                    .append(" Min ").append(arrs[i].get((arrs[i].size() - 1))).append(",")
                    .append(" Largest gap ").append(getLargest(arrs[i])).append('\n');
        }

        System.out.println(sb);
    }

    static int getLargest(ArrayList<Integer> arr) {
        int lagestValue = 0;
        
        for (int i = 1; i < arr.size(); i++) {
            lagestValue = Math.max(Math.abs(arr.get(i) - arr.get(i - 1)), lagestValue);
        }

        return lagestValue;
    }
}

