import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int cnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        for (int i = 0; i < 5; i++) {

            if (arr[i] == N) {
                cnt++;
            }

        }

        System.out.println(cnt);
    }
}