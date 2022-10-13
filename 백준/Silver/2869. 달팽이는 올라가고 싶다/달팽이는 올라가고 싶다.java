import java.io.*;
import java.util.*;

public class Main {

    static void count(int Up, int Down, int length) {
        int Day = (length - Down) / (Up - Down);

        if ((length - Down) % (Up - Down) != 0) {
            Day++;
        }

        System.out.println(Day);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        count(A, B, V);
    }
}