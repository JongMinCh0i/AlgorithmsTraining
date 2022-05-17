import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 재료의 수
        int M = sc.nextInt();  // K값
        int[] value = new int[N + 1];

        int count = 0;         // answer
        int start = 1;         // start
        int end = N;         // end

        // insert
        for (int i = 1; i < N + 1; i++) {
            value[i] = sc.nextInt();
        }

        Arrays.sort(value);
        
        while (start < end) {
            if (value[start] + value[end] < M) {
                start++; // start
            } else if (value[start] + value[end] > M) {
                end--; // end
            } else {
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);
    }
}


