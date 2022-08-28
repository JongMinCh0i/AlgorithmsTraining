import java.io.*;
import java.util.*;

public class Main {
    static int N, M, V, K, Z, sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++) {
            int nextToken = Integer.parseInt(st.nextToken()) * 5 ;

            sum += nextToken ;
        }

        System.out.println(sum);


    }
}
