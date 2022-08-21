import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] ansArr = new int[26];
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            ansArr[(int) str.charAt(i) - 97]++;
        }
        for (int i = 0; i < ansArr.length; i++) {
            sb.append(ansArr[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
