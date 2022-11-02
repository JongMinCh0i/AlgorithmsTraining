import java.io.*;
import java.util.*;

public class Main {
    static int MAX, ansIdx;
    static int TC, N, avr, determination;
    static Integer[] arr, sortedClone;
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        TC = Integer.parseInt(br.readLine());

        for (int i = 0; i < TC; i++) {
            input();
            logic();
        }

        System.out.println(sb);
    }

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        MAX = 0;
        avr = 0;
        arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            determination = Integer.parseInt(br.readLine());
            avr += determination;
            arr[i] = determination;
        }

        avr /= 2;
        sortedClone = arr.clone();
        Arrays.sort(sortedClone);
        MAX = sortedClone[N - 1];

        for (int i = 0; i < arr.length; i++) {
            if (MAX == arr[i]) {
                ansIdx = i;
                break;
            }
        }
    }

    static void logic() {
        // 최다 득표자가 과반수 득표 "majority winner R"
        // 최다 득표자가 절반 이하의 득표 "minority winner R"
        // 최다 득표자가 1명 초과 이거나 최다 득표자가 없을 때는 "no winner"
        int MAXCNT = 0;

        for (int i = 0; i < N; i++) {
            if (MAX == arr[i]) {
                MAXCNT++;
            }
        }

        if (MAXCNT > 1) {
            sb.append("no winner").append('\n');
            return;
        }

        if (MAX > avr) {
            sb.append("majority winner ").append(ansIdx + 1).append('\n');
            return;
        }

        if (MAX <= avr) {
            sb.append("minority winner ").append(ansIdx + 1).append('\n');
            return;
        }
    }
}

/*

1
3
11
13
15

minority winner3
 */