import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int[] arr;
    static int amount;
    static int min = -1;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[3];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(st.nextToken());

            arr[i] = num;
            amount += arr[i];
        }

        if (amount >= 100) {
            System.out.println("OK");
        } else {
            int i = Math.min(arr[0], arr[1]);
            int k = Math.min(i, arr[2]);

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == k) {
                    if (j == 0) {
                        System.out.println("Soongsil");
                    }
                    if (j == 1) {
                        System.out.println("Korea");
                    }
                    if (j == 2) {
                        System.out.println("Hanyang");
                    }
                }

            }
        }


    }
}
