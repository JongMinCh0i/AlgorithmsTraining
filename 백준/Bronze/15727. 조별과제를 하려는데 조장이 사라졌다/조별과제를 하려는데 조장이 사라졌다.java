import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        if (n <= 5) {
            System.out.println(1);
        } else {
            while (true) {
                cnt++;
                n -= 5;
                if (n <= 0) {
                    System.out.println(cnt);
                    break;
                }
            }

        }
    }
}
