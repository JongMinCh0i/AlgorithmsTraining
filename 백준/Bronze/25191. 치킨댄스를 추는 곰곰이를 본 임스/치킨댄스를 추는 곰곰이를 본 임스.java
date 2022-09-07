import java.io.*;
import java.security.Key;
import java.util.*;


public class Main {
    static int Chi, Coke, Beer, k;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        Chi = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Coke = Integer.parseInt(st.nextToken());
        Beer = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        int i = (Coke / 2) + Beer;
        if (Chi > i) {
            System.out.println(i);
        } else {
            System.out.println(Chi);
        }
    }
}