import java.io.*;
import java.util.*;

public class Main {
    static int Day, Lang, Math, DayOfLang, DayOfMath;
    static BufferedReader br;
    static StringBuilder sb;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        Day = arr[0];
        Lang = arr[1];
        Math = arr[2];
        DayOfLang = arr[3];
        DayOfMath = arr[4];
    }

    static void logic() {
        int tempLang = Lang / DayOfLang;
        if (Lang % DayOfLang != 0) {
            tempLang += 1;
        }

        int tempMath = Math / DayOfMath;
        if (Math % DayOfMath != 0) {
            tempMath += 1;
        }

        int ans = Integer.max(tempLang, tempMath);

        sb.append(Day - ans);

        System.out.println(sb);
    }
}