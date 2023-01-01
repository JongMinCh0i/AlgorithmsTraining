import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        BigInteger Num1 = new BigInteger(br.readLine());
        BigInteger Num2 = new BigInteger(br.readLine());
        sb.append(Num1.add(Num2));

        System.out.println(sb);
    }
}
