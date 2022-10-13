import java.io.*;
import java.util.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
        }

        Arrays.sort(arr);

        // 평균
        // int avg = Math.round((sum / N * 100) / 100  ); 차이가 뭘까
        sb.append((int) Math.round((double) sum / N)).append('\n');

        // 중앙값
        sb.append(arr[N / 2]).append('\n');

        // 최빈값
        sb.append(counting(arr)).append('\n');

        // 범위 출력
        sb.append(arr[N - 1] - arr[0]).append('\n');

        System.out.println(sb);

    }


    static int counting(int[] arr) {

        int mode = 10000;
        int mode_max = 0;

        // 빈도수가 같았았는지 여부 확인
        // 0 1 // 0 1 2  ex) 1에서 빈도수가 같았음
        // 이전의 동일한 최빈값이 1번만 등장했을경우 true, 아닐 경우 false
        boolean flag = false;

        for (int i = 0; i < N; i++) {
            int jump = 0;
            int cnt = 1; // cnt를 0으로 설정할 경우 modemax 와 cnt 둘다 0으로 if 돌지 않음
            // 주어지는 원소의 갯수가 최소 1개 이상이기때문에 최빈값의 갯수는 반드시 1개 이상이다.
            // 다반 최빈값이 2개 이상일 경우 작은 값 출력
            int first_num = arr[i];

            for (int j = i + 1; j < N; j++) {
                int second_num = arr[j];

                if (first_num != second_num) {
                    break;
                }
                cnt++;
                jump++;
          
            }

            // 문제
            // 정렬은 기본적으로 오름 차순이기에  0 0 1 1 일 경우 첫 번째 찾은 최빈값은
            // 0 이며 mode_max = 2 flag = true로 변경되었다.
            // 이후 1 역시 cnt = 2로서 cnt == mode_max를 갖고 flag == ture이기에
            // 1이 mode로 저장되고 flag는 false로 처리 된다.
            // 즉 두번째 크기의 최빈값은 2가 된다.

            // 기존 최빈값 보다 더 많은 최빈값을 찾았을 경우
            if (cnt > mode_max) {   // 초기 실행시 cnt = 1 > mode max 는 0
                mode_max = cnt;     // mode_max = 최다 빈도 값 저장
                mode = first_num;    // mode = first_num 저장
                flag = true;         // true // 최빈값 찾음

                // 동일한 최빈값과 횟수가 같을 경우 + 한번만 중복된 경우 (flag = ture) false로 초기화
                // 같은 횟수의 최빈값은 이미 찾았기에 false 처리
            } else if (cnt == mode_max && flag == true) {
                mode = first_num;
                flag = false;
            }
            // 인덱스 증가
            i += jump;
        }
        return mode;
    }
}
