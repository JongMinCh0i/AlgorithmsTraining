import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        long sum = 1;
        long fibo0 = 0;
        long fibo1 = 1;

        for (int i = 1; i < a; i++) {
            sum = fibo0 + fibo1;
            fibo0 = fibo1;
            fibo1 = sum;
        }

        System.out.println(sum);
    }
}
