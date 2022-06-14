import java.io.*;
import java.util.*;


public class Main {
    public static void compare(String i, String j) {
        char first = i.charAt(0);
        char second = i.charAt(1);
        char last = i.charAt(2);

        char rfirst = j.charAt(0);
        char rsecond = j.charAt(1);
        char rlast = j.charAt(2);

        String leftstr = String.valueOf(last).concat(String.valueOf(second)).concat(String.valueOf(first));
        String rightstr = String.valueOf(rlast).concat(String.valueOf(rsecond)).concat(String.valueOf(rfirst));

        if (Integer.parseInt(leftstr) < Integer.parseInt(rightstr)) {
            System.out.println(rightstr);
        } else {
            System.out.println(leftstr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String leftNum = st.nextToken();
        String righrNum = st.nextToken();

        compare(leftNum, righrNum);

    }
}

