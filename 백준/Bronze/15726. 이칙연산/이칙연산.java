import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static double[] arr;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        arr = new double[3];

        for (int i = 0; i < 3; i++) {
            double num = Double.parseDouble(st.nextToken());
            arr[i] = num;
        }

        int x = (int) (arr[0] * arr[1] / arr[2]);
        int y = (int) (arr[0] / arr[1] * arr[2]);


        System.out.println(Math.max(x, y));
    }
}
