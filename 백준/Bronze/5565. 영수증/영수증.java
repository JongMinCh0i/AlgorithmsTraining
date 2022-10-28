import java.io.*;

public class Main {
    static BufferedReader br;
    static int[] arr;
    static int ans, temp;


    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        ans = Integer.parseInt(br.readLine());


        for (int i = 0; i < 9; i++) {
            temp += Integer.parseInt(br.readLine());
        }


        System.out.println(ans - temp);
    }
}
