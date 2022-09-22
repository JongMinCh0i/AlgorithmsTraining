import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static String text;
    static ArrayList<String> list;
    static HashSet<String> hset = new HashSet<>();

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            text = br.readLine();
            hset.add(text);
        }
    }

    static void logic() {
        sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>(hset);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        });


        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }

        System.out.print(sb);
    }
}