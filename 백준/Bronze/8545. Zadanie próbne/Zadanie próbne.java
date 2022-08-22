import java.io.*;

public class Main {
    static BufferedReader br;
    static String str;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        char[] charArr = str.toCharArray();

        for (int i = charArr.length; i > 0; i--) {
            System.out.print(charArr[i-1]);
        }
    }
}
