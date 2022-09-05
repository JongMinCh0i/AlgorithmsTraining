import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static StringBuilder sb;
    static BufferedReader br;
    static HashMap<Integer, String> hashMap;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        hashMap = new HashMap<>();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            hashMap.put(i, str);
        }
    }

    static void logic() {
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+1 + "."  + " " + entry.getValue());
        }

    }
}
