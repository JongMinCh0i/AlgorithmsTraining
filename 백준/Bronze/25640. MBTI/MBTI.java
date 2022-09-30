import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int N;

    public static void main(String[] args) throws IOException {
        input();

    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String str1 = br.readLine();

            if (str1.equals(str)) {
                cnt++;
            }

        }

        System.out.println(cnt);
    }
}
