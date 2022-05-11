import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] S_arr = new int[N + 1]; // Origin

        st = new StringTokenizer(bf.readLine());
        for (int i = 1; i < S_arr.length; i++) {  // i < S_arr.length == i <= N
            S_arr[i] = S_arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            System.out.println(S_arr[a2] - S_arr[a1 - 1]);
        }
    }
}