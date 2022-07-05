import java.io.*;

public class Main {
    static int N;
    static int cnt = 1;
    static void find(int n) {
        while (true) {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10) ;

            if (n == N) {
                System.out.println(cnt);
                break;
            } else {
                cnt++;
            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        find(N);
    }
}
