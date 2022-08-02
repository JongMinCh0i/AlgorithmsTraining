import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger k = new BigInteger(st.nextToken());
        BigInteger y = new BigInteger(st.nextToken());

        BigInteger[] bigIntegers = k.divideAndRemainder(y);
        System.out.println(bigIntegers[0]);
        System.out.println(bigIntegers[1]);
    }
}