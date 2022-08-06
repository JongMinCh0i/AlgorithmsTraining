import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static BufferedReader br;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (6 <= str.length() && str.length() <= 9) {
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
    }
}