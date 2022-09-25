import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < 3; i++) {
            char ch = '5';
            char check = str.charAt(i);

            if (ch != check) {
                System.out.println("NO");
                return;
            } else if (ch == check && i == 2) {
                System.out.println("YES");
            }
        }
    }
}
