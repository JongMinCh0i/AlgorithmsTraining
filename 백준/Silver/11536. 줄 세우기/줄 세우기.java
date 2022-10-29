import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static ArrayList<String> originArrString, decSortedArrString, increasingArrString;
    static int N;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        originArrString = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            originArrString.add(str);
        }

        decSortedArrString = (ArrayList<String>) originArrString.clone();
        increasingArrString = (ArrayList<String>) originArrString.clone();

        Collections.sort(increasingArrString);
        Collections.sort(decSortedArrString, Collections.reverseOrder());

        if (originArrString.equals(increasingArrString)) {
            System.out.println("INCREASING");
        } else if (originArrString.equals(decSortedArrString)) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}