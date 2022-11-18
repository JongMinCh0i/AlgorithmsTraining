import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[0]) {
            System.out.println(2);
        } else if (arr[2] * arr[2] == (arr[1] * arr[1]) + (arr[0] * arr[0])) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}