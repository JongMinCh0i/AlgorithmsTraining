import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String type = str.substring(str.indexOf(".") + 1);

            if (treeMap.containsKey(type)) {
                treeMap.put(type, treeMap.get(type) + 1);
            } else {
                treeMap.put(type, 1);
            }
        }

        for (String key : treeMap.keySet()) {
            System.out.println(key + " " + treeMap.get(key));
        }
    }
}