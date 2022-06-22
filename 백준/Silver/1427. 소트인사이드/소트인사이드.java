import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] A = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        for (int i = 0; i < str.length(); i++) {
            int Max = i;
            for (int j = i + 1; j < str.length() ; j++) {
                if (A[j] > A[Max]) {
                    Max = j;
                }
                if (A[i] < A[Max]) {
                    int temp = A[i];
                    A[i] = A[Max];
                    A[Max] = temp;
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(A[i]);
        }
    }
}