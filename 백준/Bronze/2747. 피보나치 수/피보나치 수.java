
import java.util.Scanner;

public class Main {

    static int pibo(int i) {
        if (i == 0) { // 종료 시점
            return 0;
        } else if (i == 1) { // 종료 시점
            return 1;
        } else {
            int[] arr = new int[i + 1];
            arr[0] = 0;
            arr[1] = 1;
            if (i > 1) {
                for (int n = 2; n <= i; n++) {
                    arr[n] = arr[n - 2] + arr[n - 1];
                }

            }
            return arr[i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(pibo(sc.nextInt() + 1)  );
    }

}