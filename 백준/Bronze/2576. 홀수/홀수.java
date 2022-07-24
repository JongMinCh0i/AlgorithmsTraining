import java.io.*;
import java.util.*;

public class Main {
    static int count, min;

    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 7; i++) {
            int N = Integer.parseInt(br.readLine());

            if (N % 2 == 1) {
                list.add(N);

            }
        }
    }

    static void logic() {

        for (int i = 0; i < list.size(); i++) {
            count += list.get(i);
        }

        Collections.sort(list);


        if (list.size() > 0) {
            System.out.println(count);
            System.out.println(list.get(0));
        }

        if (list.size() == 0) {
            System.out.println(-1);
        }
    }
}
