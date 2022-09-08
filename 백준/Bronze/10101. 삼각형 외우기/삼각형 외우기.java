import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        if (N + M + K == 180) {

            if ((N == 60 && M == 60 && K == 60) && (N == M || M == K || N == K)) {
                System.out.println("Equilateral");
            } else if (N == M || M == K || N == K) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");

            }
        } else {
            System.out.println("Error");
        }
    }
}
