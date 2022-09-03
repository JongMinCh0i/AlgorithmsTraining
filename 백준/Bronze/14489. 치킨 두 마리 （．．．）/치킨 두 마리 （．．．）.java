import java.io.*;
import java.util.*;

public class Main {
    static int N, M, amount;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        amount = Integer.parseInt(br.readLine());
        int amount_2 = amount * 2;

        if (N + M >= amount_2) {
            System.out.println(N + M - amount_2);
        } else {
            System.out.println(M + N);
        }

    }
}
