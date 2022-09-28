import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static int ANS;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int S = Integer.parseInt(br.readLine());

            if (S == -1) {
                System.out.println(ANS);
                break;
            }

            ANS += S;
        }
    }
}
