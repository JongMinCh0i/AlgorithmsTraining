import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int max = 1;
        int max_index = 1;

        // enhanced for 주의
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
                max_index = j;
            }
        }

        System.out.println(max);
        System.out.println(max_index);
    }
}
