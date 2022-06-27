package PS;

import java.io.*;
import java.util.*;

public class Boj11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] = a;
            arr[i][1] = b;
        }
        sort(arr);
    }

    public static void sort(int[][] arr) {
        Arrays.sort(arr, (o1, o2) -> {
            // o1[0] == x
            // o1[1] == y 
            // y가 같을 경우 
            if (o1[1] == o2[1])
                // x 오름차순 정렬 
                return o1[0] - o2[0];
            // y가 다를 경우 y 오름 차순
            return o1[1] - o2[1];

        });


        for (int[] i : arr) {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}
