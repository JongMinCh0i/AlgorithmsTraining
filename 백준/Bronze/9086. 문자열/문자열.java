import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) input();
    }

    static void input() throws IOException {
        String str = br.readLine();

        System.out.print(str.charAt(0));
        System.out.print(str.charAt(str.length() - 1));
        System.out.println();
    }
}