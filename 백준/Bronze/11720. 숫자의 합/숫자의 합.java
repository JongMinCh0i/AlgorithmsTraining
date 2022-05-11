import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 5
        String str = sc.next(); // 1,2,3 // nextLine을 사용했을 때 결과 확인

        byte[] charr = str.getBytes();
        int sum = 0;

        for (byte c : charr) {
            sum += c - '0';
        }
        System.out.println(sum);
    }
}
