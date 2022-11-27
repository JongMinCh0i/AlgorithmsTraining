import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static ArrayList<Integer> arr;
    static int TC, sum;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        TC = Integer.parseInt(br.readLine());

        for (int i = 0; i < TC; i++) {
            input();
        }
    }

    static void input() throws IOException {
        sum = 0;
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        arr = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num % 2 == 0) {
                arr.add(num);
            }
        }

        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        sb.append(sum).append(" ").append(arr.get(0));
        System.out.println(sb);
    }
}