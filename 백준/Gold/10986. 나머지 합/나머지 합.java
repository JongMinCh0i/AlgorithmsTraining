import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] S = new long[N];
        long[] C = new long[M];
        long counter = 0;
        S[0] = sc.nextInt();
        // 누적합
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + sc.nextInt();
        }

        // 배열의 모든 값에 % 연산
        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);
            if (remainder == 0) counter++;
            C[remainder]++;
        }
        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                counter = counter + (C[i] * (C[i] - 1) / 2);
            }
        }
        System.out.println(counter);
    }
}