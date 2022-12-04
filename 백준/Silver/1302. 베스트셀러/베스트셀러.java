import java.io.*;
import java.util.*;

class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static int N;
    static HashMap<String, Integer> hashMap;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        hashMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (hashMap.get(str) == null) {
                hashMap.put(str, 1);
            } else {
                hashMap.put(str, hashMap.get(str) + 1);
            }
        }

        int max = 0;
        for (String a : hashMap.keySet()) {
            max = Math.max(max, hashMap.get(a));
        }

        ArrayList<String> arr = new ArrayList<>(hashMap.keySet());
        Collections.sort(arr);

        for (String str : arr) {
            if (hashMap.get(str) == max) {
                sb.append(str);
                break;
            }
        }

        System.out.println(sb);
    }
}