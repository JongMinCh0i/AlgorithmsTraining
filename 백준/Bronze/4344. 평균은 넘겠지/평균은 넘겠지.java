import java.io.*;
import java.util.*;

public class Main {
    static int T;
    static BufferedReader br;
    static StringTokenizer st;
    static ArrayList<Integer>[] arrayLists;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        input();
        logic();
    }

    public static void input() throws IOException {
        arrayLists = new ArrayList[T];

        for (int i = 0; i < T; i++) {
            arrayLists[i] = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            for (int j = 0; j < k; j++) {
                int num = Integer.parseInt(st.nextToken());
                arrayLists[i].add(num);
            }
        }
    }

    public static void logic() {
        for (int i = 0; i < arrayLists.length; i++) {
            double sum = 0;
            double cnt = 0;

            for (int j = 0; j < arrayLists[i].size(); j++) {

                sum += arrayLists[i].get(j);
            }

            double avg = sum / arrayLists[i].size();

            for (int k = 0; k < arrayLists[i].size(); k++) {
                if (avg < arrayLists[i].get(k)) {
                    cnt += 1.0;
                }
            }

            System.out.printf("%.3f%%\n", (cnt / arrayLists[i].size()) * 100);
        }
    }
}