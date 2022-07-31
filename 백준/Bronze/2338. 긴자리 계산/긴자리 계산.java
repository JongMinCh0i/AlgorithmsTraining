import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger bi = new BigInteger(br.readLine());
        BigInteger bj = new BigInteger(br.readLine());
        
        System.out.println(bi.add(bj));
        System.out.println(bi.subtract(bj));
        System.out.println(bi.multiply(bj));
    }
}
