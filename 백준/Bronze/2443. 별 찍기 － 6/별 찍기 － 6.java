import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        logic(N);
    }

    static void logic(int star) {
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (star - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
