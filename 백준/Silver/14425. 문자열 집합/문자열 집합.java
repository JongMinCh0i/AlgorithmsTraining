import java.io.*;
import java.util.*;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> hashMap = new HashMap<>();
        String[] strArr = new String[M];


        for (int i = 0; i < N; i++) {
            hashMap.put(i, br.readLine());
        }

        for (int i = 0; i < M; i++) {
            strArr[i] = br.readLine();
        }

        int cnt = 0;

        for (int i = 0; i < M; i++) {
            String str = strArr[i];
            for (int j = 0; j < N; j++) {
                if (str.equals(hashMap.get(j))) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
