import java.io.*;
import java.util.*;

public class Main {
    static int[] arr = new int[8];
    static StringTokenizer st;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            int k = Integer.parseInt(st.nextToken());
            arr[i] = k;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 4; i < 8; i++) {
            int k = Integer.parseInt(st.nextToken());
            arr[i] = k;
        }

        int num1 = arr[0] + arr[1] + arr[2] + arr[3];
        int num2 = arr[4] + arr[5] + arr[6] + arr[7];

        if (num1 == num2) {
            System.out.println(num1);
        } else {
            System.out.println(Math.max(num1, num2));

        }
    }
}
