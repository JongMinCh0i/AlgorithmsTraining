import java.io.*;

public class Main {
    static BufferedReader br;
    static int N;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            N = Integer.parseInt(br.readLine());

            if (N == 0) break;
            printStar(N);

        }
    }

    static void printStar(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
