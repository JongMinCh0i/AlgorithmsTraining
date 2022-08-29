import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static int[] intArr, secondIntArr;
    static BufferedReader br;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        intArr = new int[4];
        secondIntArr = new int[2];

        for (int i = 0; i < 4; i++) {
            N = Integer.parseInt(br.readLine());
            intArr[i] = N;
        }

        for (int i = 0; i < 2; i++) {
            K = Integer.parseInt(br.readLine());
            secondIntArr[i] = K;
        }

        Arrays.sort(intArr);
        Arrays.sort(secondIntArr);

        int num1 = intArr[3] + intArr[1] + intArr[2];
        int num2 = secondIntArr[1];


        System.out.println(num1 + num2);
    }
}
