import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = 0;

        K = N / 4;

        for (int i = 0 ;i < K; i++) {
            sb.append("long ");
        }

        sb.append("int");

        System.out.println(sb);

    }
}
