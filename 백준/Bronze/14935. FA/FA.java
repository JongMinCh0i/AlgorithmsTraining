import java.io.*;

public class Main {
    static int cnt = 0;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        fuc(str);
    }

    static void fuc(String str) {
        if (str.equals(String.valueOf(k))) {
            System.out.println("FA");
            cnt++;
            return;
        } else if (str.equals(String.valueOf(k)) && cnt < 2) {
            System.out.println("NFA");
        }

        int first = Integer.parseInt(String.valueOf(str.charAt(0)));
        int last = str.length();

        k = first * last;

        fuc(String.valueOf(k));
    }
}

