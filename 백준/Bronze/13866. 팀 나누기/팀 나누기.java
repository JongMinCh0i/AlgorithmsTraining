import java.io.*;
import java.util.*;

public class Main {
    static int[] intArr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        intArr = new int[4];

        for (int i = 0; i < 4; i++) {
            int num = Integer.parseInt(st.nextToken());

            intArr[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(intArr);
        int n = intArr[0] + intArr[3];
        int m = intArr[1] + intArr[2];

        System.out.println(Math.abs(n - m));
    }
}
