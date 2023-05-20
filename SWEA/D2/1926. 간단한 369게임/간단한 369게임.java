import java.io.*;

public class Solution {
    static StringBuilder sb;
    static BufferedReader br;
    static int N;
    static int[] selected;

    public static void main(String[] args) throws IOException {
        input();
        rec_fun(1);
        System.out.println(sb);
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        selected = new int[2];
    }

    static void rec_fun(int k) {
        if (k == 2) {
            sb.append(selected[0]).append(" ");
        } else {
            for (int cand = 1; cand <= N; cand++) {
                String str = String.valueOf(cand);

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    if (ch == '3') {
                        sb.append("-");
                    }
                    if (ch == '6') {
                        sb.append("-");
                    }
                    if (ch == '9') {
                        sb.append("-");
                    }
                }

                selected[0] = cand;
                String Str = String.valueOf(cand);
                if (Str.contains("3")) {
                    sb.append(" ");
                    continue;
                }

                if (Str.contains("6")) {
                    sb.append(" ");
                    continue;
                }

                if (Str.contains("9")) {
                    sb.append(" ");
                    continue;
                }

                rec_fun(k + 1);
            }
        }
    }
}