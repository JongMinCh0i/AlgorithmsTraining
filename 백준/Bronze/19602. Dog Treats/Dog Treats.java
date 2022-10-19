import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int S, M , L;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        S = Integer.parseInt(br.readLine()) * 1;
        M = Integer.parseInt(br.readLine()) * 2;
        L = Integer.parseInt(br.readLine()) * 3;

        if (S + M + L >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}