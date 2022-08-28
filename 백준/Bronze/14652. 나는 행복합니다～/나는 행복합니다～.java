import java.io.*;
import java.util.*;

public class Main {
    static int N, M, CNT;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        CNT = Integer.parseInt(st.nextToken());

        System.out.println(CNT / M + " " + CNT % M);

    }
}
