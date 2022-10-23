import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("END")) {
                System.out.print(sb);
                break;
            }

            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }

            sb.append('\n');
        }
    }
}
