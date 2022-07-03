import java.io.*;
import java.util.*;

public class Main {

    static void fun(long i, long j) {
        long result = Math.abs(i - j);

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long i = Long.parseLong(st.nextToken());
        long j = Long.parseLong(st.nextToken());

        fun(i, j);

    }
}