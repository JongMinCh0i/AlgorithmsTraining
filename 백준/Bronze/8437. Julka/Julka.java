import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger int1 = new BigInteger(br.readLine());
        BigInteger int2 = new BigInteger(br.readLine());
        BigInteger int3 = new BigInteger("2");

        BigInteger kla = int1.subtract(int2).divide(int3).add(int2);
        BigInteger nat = int1.subtract(int2).divide(int3);

        System.out.println(kla);
        System.out.println(nat);
    }
}
