import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int N;
    static long[] arrLong;
    static int modeCnt, tempCnt;
    static long mode;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arrLong = new long[N];

        for (int i = 0; i < N; i++) {
            arrLong[i] = Long.parseLong(br.readLine());
        }
    }

    static void logic() {
        Arrays.sort(arrLong);
        mode = arrLong[0];
        modeCnt = 1;
        tempCnt = 1;

        for (int i = 1; i < arrLong.length; i++) {
            if (arrLong[i] == arrLong[i - 1]) {
                modeCnt++;
            } else if (arrLong[i] != arrLong[i - 1]) {
                modeCnt = 1;
            }

            if (modeCnt > tempCnt) {
                tempCnt = modeCnt;
                mode = arrLong[i];
            }
        }
        System.out.println(mode);
    }
}