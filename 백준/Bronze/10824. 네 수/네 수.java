import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        String str1 = st.nextToken();
        String str2 = st.nextToken();
        String str3 = st.nextToken();
        String str4 = st.nextToken();

        long A = Long.parseLong(str1.concat(str2));
        long B = Long.parseLong(str3.concat(str4));

        System.out.println(A + B);
    }
}
