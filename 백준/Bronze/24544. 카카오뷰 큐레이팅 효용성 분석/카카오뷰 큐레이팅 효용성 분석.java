import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int[] contentArr, regiArr;
    static int N, content, regi;


    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        contentArr = new int[N];
        regiArr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) contentArr[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) content += contentArr[i];

        sb.append(content).append('\n');

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) regiArr[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            if (regiArr[i] == 1) {
                continue;
            }

            if (regiArr[i] == 0) {
                regi += contentArr[i];
            }
        }

        sb.append(regi);

        System.out.println(sb);

    }

}
