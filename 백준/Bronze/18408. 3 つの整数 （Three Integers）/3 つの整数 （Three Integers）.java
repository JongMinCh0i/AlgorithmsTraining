import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int checkOne, checkTwo, ans;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 3; i++) {
            if (arr[i] == 1) {
                checkOne++;
            } else {
                checkTwo++;
            }
        }

        if (checkOne > checkTwo) {
            ans = 1;
        } else {
            ans = 2;
        }

        System.out.println(ans);

    }
}
