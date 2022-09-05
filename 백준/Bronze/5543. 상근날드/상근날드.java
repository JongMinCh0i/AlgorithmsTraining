import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int[] arrInt, verInt;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        arrInt = new int[3];
        verInt = new int[2];
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(br.readLine());
            arrInt[i] = num;
        }

        for (int i = 0; i < 2; i++) {
            int num = Integer.parseInt(br.readLine());
            verInt[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(arrInt);
        int bugger = arrInt[0];
        Arrays.sort(verInt);
        int ver = verInt[0];

        sb.append(bugger + ver - 50);

        System.out.println(sb);

    }
}
