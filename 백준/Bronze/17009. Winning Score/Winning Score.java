import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int N, M;

    public static void main(String[] args) throws IOException {
        int[] arr = new int[6];
        br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 6; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        N = (arr[0] * 3) + (arr[1] * 2) + (arr[2]);
        M = (arr[3] * 3) + (arr[4] * 2) + (arr[5]);


        if (N == M) {
            System.out.println("T");
        }

        if (N < M) {
            System.out.println("B");
        }
        if (N > M) {
            System.out.println("A");
        }
    }
}
