import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;
    static int[] arr;
    static int max = 0;
    static int index = 0;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int sum = m + j + k + w;
            arr[i] = sum;

            if (max <= sum) {
                max = sum;
                index = i + 1;
            }
        }

        Arrays.sort(arr);

        System.out.print(index + " " + arr[4]);
    }
}
