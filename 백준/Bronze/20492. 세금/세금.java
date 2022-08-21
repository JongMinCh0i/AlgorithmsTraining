import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        float k = (float) (n * (0.22));
        int x = (int) (n * 0.2); // 20%
        float l = (float) (x * (0.22));
        int z = (int) (n - l);

        System.out.println((int) (n - k) + " " + z);

    }
}
