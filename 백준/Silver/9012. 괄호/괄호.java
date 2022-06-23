import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Stack<String> stk = new Stack<>();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            stk.add(br.readLine());
        }
        check();
    }

    static void check() {

        int sum = 0;

        for (int i = 0; i < stk.size(); i++) {
            String str = String.valueOf(stk.get(i));
            sum = 0;
            for (int j = 0; j < str.length(); j++) {
                String check = String.valueOf(str.charAt(j));

                switch (check) {
                    case "(":
                        sum += 1;

                        break;
                    case ")":
                        sum -= 1;
                        break;
                }
                if (sum < 0) {
                    break;
                }
            }

            if (sum == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}