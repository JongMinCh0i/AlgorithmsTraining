import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int N;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            System.out.println(br.readLine().toLowerCase());
        }

    }
}
