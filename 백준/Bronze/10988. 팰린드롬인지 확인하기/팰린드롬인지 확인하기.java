import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static boolean check;
    static char ch, ch2;
    static char[] chArr;
    static String str;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        chArr = str.toCharArray();
        int j = str.length();

        for (int i = 0; i < str.length(); i++) {
            j--;

            ch = chArr[i];
            ch2 = chArr[j];

            if (ch != ch2) {
                check = false;
                break;
            } else {
                check = true;
            }
        }

        if (check) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}