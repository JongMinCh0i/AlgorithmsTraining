import java.io.*;
import java.util.*;

public class Main {
    static int amount, kind, ans, temp;
    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        amount = Integer.parseInt(br.readLine());
        kind = Integer.parseInt(br.readLine());

        for (int i = 0; i < kind; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            temp += money * cnt;
        }

        if (temp == amount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}