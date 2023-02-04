import java.io.*;
import java.util.*;

public class Solution {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int NUM = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= NUM; i++) {
            for (int j = NUM; j >= 1; j--) {
                if (i * j == NUM) {
                    list.add(i);
                    list.add(j);
                }

                if (i > j) {
                    Collections.sort(list);
                    break;
                }
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
    }
}