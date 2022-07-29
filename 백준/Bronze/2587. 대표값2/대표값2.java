import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static ArrayList<Integer> arrayList;
    static int avr;
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        arrayList = new ArrayList<>();
        br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            avr += num;
            arrayList.add(num);
        }
    }

    static void logic() {
        Collections.sort(arrayList);
        System.out.println(avr / 5);
        System.out.println(arrayList.get(arrayList.size() / 2));

    }
}
