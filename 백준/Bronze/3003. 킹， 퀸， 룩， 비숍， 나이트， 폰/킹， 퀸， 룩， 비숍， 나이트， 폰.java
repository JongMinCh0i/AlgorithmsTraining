import java.io.*;
import java.util.*;

public class Main {
    static int check_k = 1;
    static int check_q = 1;
    static int check_lk = 2;
    static int check_bi = 2;
    static int check_ni = 2;
    static int check_ph = 8;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int lk = Integer.parseInt(st.nextToken());
        int bi = Integer.parseInt(st.nextToken());
        int ni = Integer.parseInt(st.nextToken());
        int ph = Integer.parseInt(st.nextToken());

        k = check_k - k;
        q = check_q - q;
        lk = check_lk - lk;
        bi = check_bi - bi;
        ni = check_ni - ni;
        ph = check_ph - ph;

        System.out.print(k + " " + q + " " + lk + " " + bi + " " + ni + " " + ph);
    }
}
