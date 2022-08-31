import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K, V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        V = Integer.parseInt(br.readLine());

        int min = N + M + K + V;

        int MIn = min / 60;
        int second = min % 60;

        System.out.println(MIn);
        System.out.println(second);
    }

}
