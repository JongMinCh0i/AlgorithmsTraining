import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int N, M;
    static String K, V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = br.readLine();
        V = br.readLine();

        BigInteger int1 = new BigInteger(K);
        BigInteger int2 = new BigInteger(V);
        
        if (K.length() == N && V.length() == M) {
            System.out.println((int1.multiply(int2)));

        }

    }
}
