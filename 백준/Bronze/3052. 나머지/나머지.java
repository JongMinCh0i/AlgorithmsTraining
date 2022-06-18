import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<Integer> hashSet = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 10; i++) {
            hashSet.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(hashSet.size());

    }
}
