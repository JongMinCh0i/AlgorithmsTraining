import java.io.*;
import java.util.*;

public class Main {
    static int y;
    static int[] A;
    static int[] B;

    public static void main(String[] args) throws IOException {
        A = new int[3];
        B = new int[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int z = Math.abs(A[0] - B[2]);


        if (A[1] > B[1]) {
             y = Math.abs(A[1] / B[1]);
        } else if (A[1] < B[1]) {
             y = Math.abs(B[1] / A[1]);
        }  else {
             y = 1;
        }

        int x = Math.abs(A[2] - B[0]);

        System.out.println(x + " " + y + " " + z);

    }
}