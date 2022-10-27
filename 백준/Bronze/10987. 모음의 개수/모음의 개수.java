import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
