import java.io.*;
import java.util.*;

public class Main {
    static int cnt;
    static String str;
    static StringBuilder sb;
    static char[] charSet = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sb);
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        while (true) {
            cnt = 0;
            str = br.readLine();
            if (str.equals("#")) break;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                for (int j = 0; j < charSet.length; j++) {
                    if (ch == charSet[j]) {
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
    }
}
