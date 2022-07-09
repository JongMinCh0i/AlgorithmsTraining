import java.io.*;
import java.util.*;

public class Main {
    static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char N = str.charAt(i);
            switch (N) {
                case 'A':
                case 'B':
                case 'C':
                    num = num + 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    num = num + 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    num = num + 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    num = num + 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    num = num + 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    num = num + 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    num = num + 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    num = num + 10;
                    break;
            }
        }
        sb.append(num);
        System.out.println(sb);
    }
}
