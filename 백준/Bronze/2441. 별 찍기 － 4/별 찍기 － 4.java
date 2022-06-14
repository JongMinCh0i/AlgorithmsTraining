import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        for (int i = 1; i <= A; ++i) { // 총 횟수
            for (int j = 1; j <= i - 1; ++j) {
                System.out.print(" ");
            }
            for (int k = 1; k <= A - i + 1; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
