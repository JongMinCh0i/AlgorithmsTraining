import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = {N, M, K};

        Arrays.sort(arr);

        int max = arr[2];

        int an1 = max - arr[0];
        int an2 = max - arr[1];

        System.out.println(an1 + an2);

    }
}
