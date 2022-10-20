import java.io.*;

public class Main {
    static BufferedReader br;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str.toUpperCase());
    }
}
