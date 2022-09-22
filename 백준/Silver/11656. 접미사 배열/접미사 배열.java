import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static String str;
    static int str_length;
    static String[] arr;

    public static void main(String[] args) throws IOException {

        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        str_length = str.length();
        arr = new String[str_length];

        for (int i = 0; i < str_length; i++) {
            String add = str.substring(i);
            arr[i] = add;
        }
    }

    static void logic() {
        Arrays.sort(arr);
        for (int i = 0; i < str_length; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
