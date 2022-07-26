import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        input();

    }

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            sb.append(st.nextToken().charAt(0));
        }

        System.out.println(sb);

    }


}

