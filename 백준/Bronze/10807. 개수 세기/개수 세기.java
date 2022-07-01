import java.io.*;
import java.util.*;

public class Main {
    static int N, Y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for (int i = 0; i < N; i++) {
            Y = Integer.parseInt(st.nextToken());

            if (hashMap.get(Y) == null) {
                hashMap.put(Y, 1);
            } else {
                hashMap.put(Y, hashMap.get(Y) + 1);
            }
        }

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        if (hashMap.containsKey(k)) {
            System.out.println(hashMap.get(k));
        } else {
            System.out.println(0);
        }
    }
}
