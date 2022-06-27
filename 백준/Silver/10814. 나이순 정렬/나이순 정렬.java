import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Human[] arr = new Human[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Human(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i].age + " " + arr[i].name);
        }
    }

    static class Human implements Comparable<Human> {
        int age;
        String name;

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Human o) {
            return this.age - o.age;
        }
    }
}
