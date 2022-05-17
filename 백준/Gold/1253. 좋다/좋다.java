import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        long[] arr = new long[N];

        for (int index = 0; index < N; index++) {
            arr[index] = sc.nextInt();
        }

        Arrays.sort(arr); // 정렬

//        if((i!=key) && (j!=key))  {
//            i -= key;
//            j += j;
//        while (arr[i] < arr[j]) {
//
//            } if(arr[i] + arr[j] > key) {
//                j--;
//            } else if(arr[i] + arr[j] < key) {
//                i++;
//            } else {
//                count++;
//            }
//        }

        for (int k = 0; k < N; k++) {
            long find = arr[k];  // key <= 1; // key의 값이 하나씩 증가해야함으로 배열에 넣어서 인덱스 처리
            int i = 0;  // start_num
            int j = N - 1;  // end_num

            // 투 포인터 알고리즘
            while (i < j) {
                if (arr[i] + arr[j] == find) {
                    if (i != k && j != k) { // arr[i] != k && arr[j] != k 가 아님
                        count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else {
                        j--;
                    }
                } else if (arr[i] + arr[j] < find) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(count);
    }
}