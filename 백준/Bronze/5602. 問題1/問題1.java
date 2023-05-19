import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int[] arr, arrClone;
    static HashSet<Integer> hashSet = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            for (int j = 0; j < M; j++) {
                arr[j] += Integer.parseInt(st.nextToken());
            }
        }

        arrClone = arr.clone();
        Arrays.sort(arrClone);
    }

    static void logic() {

        for (int i = M - 1; i >= 0; i--) {

            int num = arrClone[i];

            for (int j = 0; j < M; j++) {
                int num2 = arr[j];

                if (num == num2) {
                    hashSet.add(j + 1);
                }
            }
        }

        Object[] objects = hashSet.toArray();
        for (int i = 0; i < objects.length; i++) {
            sb.append(objects[i]).append(" ");
        }

        System.out.println(sb);

    }
}