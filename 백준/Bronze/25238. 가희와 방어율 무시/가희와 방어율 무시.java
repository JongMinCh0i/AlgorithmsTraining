import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static float k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        k = (float) (N * (M * 0.01));

        if (N - k >= 100) {
            System.out.println(0);
        } else  {
            System.out.println(1);
        }

    }
}