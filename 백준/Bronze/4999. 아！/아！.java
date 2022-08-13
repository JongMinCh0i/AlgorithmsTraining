import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static String doc_str, pat_str;
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        doc_str = br.readLine();
        pat_str = br.readLine();
    }

    static void logic() {
        int doc = doc_str.length();
        int pat = pat_str.length();

        if (doc < pat) {
            System.out.println("no");
        } else{
            System.out.println("go");

        }
    }
}
