import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] money = new int[N];

        int answer = 0;
        int M = sc.nextInt();

        boolean condition = true;


        for (int i = 0; i < N; i++) {
            money[i] = sc.nextInt();
        }

        for (int i = money.length - 1; i >= 0; i--) {
            int num = money[i];
            if (num <= M) {
                answer += (M / num);
                M = M % num;
            }
        }
        if (condition)
            System.out.println(answer);
    }
}