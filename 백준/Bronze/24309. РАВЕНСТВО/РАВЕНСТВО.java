import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Long N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger bigN = new BigInteger(br.readLine());
        BigInteger bigM = new BigInteger(br.readLine());
        BigInteger bigK = new BigInteger(br.readLine());
        
        BigInteger answer = bigM.subtract(bigK).divide(bigN);
        System.out.println(answer);
    }
}
