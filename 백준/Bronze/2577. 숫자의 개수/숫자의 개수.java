import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = Integer.parseInt(str3);

        int result = a * b * c;

        for (int i = 0; i < String.valueOf(result).length(); i++) {
            char c1 = String.valueOf(result).charAt(i);
            switch (c1) {
                case '0':
                    arr[0] = arr[0] + 1;
                    break;
                case '1':
                    arr[1] = arr[1] + 1;
                    break;
                case '2':
                    arr[2] = arr[2] + 1;
                    break;
                case '3':
                    arr[3] = arr[3] + 1;
                    break;
                case '4':
                    arr[4] = arr[4] + 1;
                    break;
                case '5':
                    arr[5] = arr[5] + 1;
                    break;
                case '6':
                    arr[6] = arr[6] + 1;
                    break;
                case '7':
                    arr[7] = arr[7] + 1;
                    break;
                case '8':
                    arr[8] = arr[8] + 1;
                    break;
                case '9':
                    arr[9] = arr[9] + 1;
                    break;
            }
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
