import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();


        if (str.length() == 2) {

            String str1 = str.substring(0, 1);
            String str2 = str.substring(1, 2);

            int n = Integer.parseInt(str1);
            int m = Integer.parseInt(str2);

            System.out.println(n + m);
        }

        if (str.length() == 3) {

            String str1 = str.substring(0, 2);
            String str2 = str.substring(2, 3);

            int n = Integer.parseInt(str1);
            int m = Integer.parseInt(str2);

            if (n > 10) {
                str1 = str.substring(0, 1);
                str2 = str.substring(1, 3);

                 n = Integer.parseInt(str1);
                 m = Integer.parseInt(str2);

                System.out.println(n + m);

                return;
            }

            System.out.println(n + m);
        }

        if (str.length() == 4) {
            System.out.println(20);
        }
    }
}
