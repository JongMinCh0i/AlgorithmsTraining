import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int cnt;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String Trash = br.readLine();
        String ans = br.readLine();

        for (int i = 0; i < ans.length(); i++) {
            char ch = ans.charAt(i);

            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
