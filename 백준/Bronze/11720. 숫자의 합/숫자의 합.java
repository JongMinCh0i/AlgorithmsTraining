import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();

        char[] charr = str.toCharArray();
        int sum = 0;

        for (char c : charr) {
            sum += c - '0';
        }
        System.out.println(sum);
    }
}
