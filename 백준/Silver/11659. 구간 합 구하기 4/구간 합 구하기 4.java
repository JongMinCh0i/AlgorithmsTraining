import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A_arr = new int[N + 1]; // 구간합 배열
        int[] S_arr = new int[N + 1]; // Origin

        st = new StringTokenizer(bf.readLine());

        for (int i = 1; i < A_arr.length; i++) {
            S_arr[i] = Integer.parseInt(st.nextToken());
            A_arr[i] = S_arr[i] + A_arr[i - 1];
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());

            System.out.println(A_arr[a2] - A_arr[a1 - 1]);
        }
    }
}