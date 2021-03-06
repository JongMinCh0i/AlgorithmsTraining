import java.io.*;
import java.util.*;

public class Main {

    static int N, M, max, temp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N - 2; i++) {
            int firstCard = arr[i];
            for (int j = i + 1; j <= N - 1; j++) {
                int secondCard = arr[j];
                for (int k = j + 1; k <= N; k++) {
                    int thirdCard = arr[k];

                    max = firstCard + secondCard + thirdCard;

                    if (temp < max && max < M) {
                        temp = max;
                    }

                    if (max == M) {
                        System.out.println(max);
                        return;
                        
                        // break; 일 경우 해당 반복문만 탈출한다
                        // return 일 경우 해당 반복묹 전체를 탈출한다.
                    }
                }
            }
        }
        System.out.println(temp);
    }
}
