import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static String str;
    static ArrayList<Character> first, second;

    public static void main(String[] args) throws IOException {
        input();
    }
    
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        first = new ArrayList<>();
        second = new ArrayList<>();

        while (true) {
            str = br.readLine();

            if (str.equals("0")) {
                break;
            }

            logic(str);

            first.clear();
            second.clear();
        }
    }

    static void logic(String str) {
        for (int i = 0; i < str.length(); i++) {
            first.add(str.charAt(i));
        }

        for (int j = str.length() - 1; j >= 0; j--) {
            second.add(str.charAt(j));
        }

        if (first.equals(second)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}