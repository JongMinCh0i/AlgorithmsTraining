import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long i = Long.parseLong(st.nextToken());
        long j = Long.parseLong(st.nextToken());

        long left = i + j;
        long right = i - j;


        System.out.println(left * right);

    }
}
