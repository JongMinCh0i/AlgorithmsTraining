import java.util.Scanner;
import java.io.*;

public class Main {
    static BufferedReader br;
    static int N;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        logic(N);
    }

    static void logic(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = i; j < N; j++) System.out.print(" ");
            for (int k = 0; k < i * 2 - 1; k++) System.out.print("*");
            System.out.println();
        }
    }
}

