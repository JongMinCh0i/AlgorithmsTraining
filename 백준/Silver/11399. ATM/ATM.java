import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A];
        int[] answer = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(arr);

        answer[0] = arr[0];

        int sum = answer[0];

        // 합 배열 생성
        for (int i = 1; i < A; i++) {
            answer[i] = answer[i - 1] + arr[i];
            sum += answer[i];
        }

        System.out.println(sum);
    }
}