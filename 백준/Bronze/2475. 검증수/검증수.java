import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = 0;
        for (int i = 0; i < 5; i++) {
            int temp = Integer.parseInt(st.nextToken());
            N += temp * temp;
        }
        int answer = N % 10;
        sb.append(answer);
        System.out.println(sb);
    }
}