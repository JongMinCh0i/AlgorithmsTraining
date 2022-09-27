import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine()); //

        for (int i = 0; i < A; i++) {
            int count = 0;
            int sum = 0;
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) == 'O')) {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
