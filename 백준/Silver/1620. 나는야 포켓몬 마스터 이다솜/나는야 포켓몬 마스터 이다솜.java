import java.io.*;
import java.util.*;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Map<Integer, String> hashmap = new HashMap<>();
        HashMap<String, Integer> hashmap2 = new HashMap<>();

        //input
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            hashmap.put(i, name);
            hashmap2.put(name, i);
        }

        //function
        for (int i = 1; i <= M; i++) {
            String find = br.readLine();

            if (findNum(find)) {
                sb.append(hashmap.get(Integer.parseInt((find)))).append('\n');
            } else {
                sb.append(hashmap2.get((find))).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static boolean findNum(String str) {
        char i = str.charAt(0);
        if (!Character.isDigit(i)) {
            return false;
        }
        return true;
    }
}