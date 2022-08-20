import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int k = 0;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            int j = Integer.parseInt(br.readLine());
            k += j;
        }
        System.out.println(k);
    }

}
