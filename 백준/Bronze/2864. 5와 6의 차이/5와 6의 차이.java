import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String str2 = st.nextToken();

        sb.append(Integer.parseInt(str.replaceAll("6", "5")) + Integer.parseInt(str2.replaceAll("6", "5")));
        sb.append(" ");
        sb.append(Integer.parseInt(str.replaceAll("5", "6")) + Integer.parseInt(str2.replaceAll("5", "6")));
        System.out.println(sb);
    }

}
