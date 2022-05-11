import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        double sum = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; // all mount
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        double result = (sum * 100) / max / size;

        System.out.println(result);
    }
}
