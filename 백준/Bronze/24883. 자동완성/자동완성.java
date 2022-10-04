import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (str.equals("N") || str.equals("n")) {
            System.out.println("Naver D2");
        } else
            System.out.println("Naver Whale");

    }
}