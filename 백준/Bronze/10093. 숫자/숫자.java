import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int cnt;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        String str1 = st.nextToken();
        String str2 = st.nextToken();

        long num1 = Long.parseLong(str1);
        long num2 = Long.parseLong(str2);

        BigInteger N = new BigInteger(str1);
        BigInteger M = new BigInteger(str2);
        BigInteger one = new BigInteger("1");

        if (num2 == num1) {
            cnt = 0;
        } else if (num2 > num1) {
            cnt = (int) (num2 - num1 - 1);
        } else {
            cnt = (int) (num1 - num2 - 1);
        }

        sb.append(cnt).append('\n');

        if (num2 > num1) {
            for (int i = 0; i < cnt; i++) {
                num1++;
                sb.append(num1).append(" ");
            }
        } else if (num2 < num1) {
            for (int i = 0; i < cnt; i++) {
                num2++;
                sb.append(num2).append(" ");
            }


        }
        System.out.print(sb);
    }
}