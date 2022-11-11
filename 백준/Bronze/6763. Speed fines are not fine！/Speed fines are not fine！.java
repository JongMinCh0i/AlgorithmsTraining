import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N, M;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        int ans = M - N;

        if (N >= M) System.out.println("Congratulations, you are within the speed limit!");
        else {
            if (ans <= 20)
                sb.append("You are speeding and your fine is $100.");
            else if (ans <= 30)
                sb.append("You are speeding and your fine is $270.");
            else sb.append("You are speeding and your fine is $500.");
        }

        System.out.println(sb);

    }
}