import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'C' || ch == 'A' || ch == 'M' || ch == 'B' || ch == 'R' || ch == 'I' || ch == 'D' || ch == 'G' || ch == 'E') {
                continue;
            } else {
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
