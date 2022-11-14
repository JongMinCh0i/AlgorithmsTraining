import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;

    static int cnt = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[4];

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            cnt = cnt - num1;

            int num2 = Integer.parseInt(st.nextToken());
            cnt = cnt + num2;

            arr[i] = cnt;
        }

        Arrays.sort(arr);

        System.out.println(arr[3]);
    }
}
