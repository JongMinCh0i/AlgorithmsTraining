import java.io.*;
import java.util.*;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 10; i++) {
            cnt = st.countTokens();
        }

        System.out.println(cnt);

    }
}
