import java.io.*;
import java.util.*;

public class Solution {
    static StringBuilder sb;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] ch = str.toCharArray();

        for (char c : ch) {
            sb.append(Character.getNumericValue(c) - 9).append(" ");
        }
        System.out.println(sb);
    }
}