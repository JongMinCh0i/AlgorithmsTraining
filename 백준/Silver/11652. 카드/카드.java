import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        // 첫 번째 최빈값은 값이 진행 되는 순간 해당 값
        // int mode로 값을 표현할 경우 해당 문제의 범위에서 overflow 및 underflow 발생
        Arrays.sort(arr, 1, N + 1);
        
        long mode = arr[1];
        // 최빈값이 등장했던 횟수
        long modeCnt = 1;
        //  현재 숫자의 등장 횟수
        long currentCnt = 1;


        for (int i = 2; i <= N; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCnt++;
            } else {
                currentCnt = 1;
            }
            if (modeCnt < currentCnt) {
                modeCnt = currentCnt;
                mode = arr[i];
            }
        }
        System.out.println(mode);
    }
}