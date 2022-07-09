import java.io.*;

public class Main {
    static int cnt = 0;
    static char find;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int length = str.length();

        find(str);

        System.out.println(length - cnt);
    }

    static void find(String str) {
        for (int i = 1; i < str.length(); i++) {
            find = str.charAt(i);

            if (find == '=') {
                if (str.charAt(i - 1) == 'c' || str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 's') {
                    cnt += 1;
                }

                if (i >= 2) {
                    if (str.charAt(i - 1) == 'z' && str.charAt(i - 2) == 'd') {
                        cnt += 1;
                    }
                }
            }

            if (find == '-') {
                if (str.charAt(i - 1) == 'c' || str.charAt(i - 1) == 'd') {
                    cnt += 1;
                }
            }

            if (find == 'j') {
                if (str.charAt(i - 1) == 'l' || str.charAt(i - 1) == 'n') {
                    cnt += 1;
                }
            }
        }
    }
}