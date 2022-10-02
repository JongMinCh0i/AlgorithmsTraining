import java.io.*;
import java.util.*;

public class Main {
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 5; i++) {
            int check = Integer.parseInt(st.nextToken());

            if (N == check) ans++;

        }

        System.out.println(ans);
    }
}
