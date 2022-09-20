import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int[] Ori_arr, Sorted_arr, tempArr;
    static int sum;

    public static void main(String[] args) throws IOException {

        input();
        logic();
    }

    static void input() throws IOException {
        tempArr = new int[8];
        sb = new StringBuilder();
        Ori_arr = new int[8];
        Sorted_arr = new int[8];
        br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            int num = Integer.parseInt(br.readLine());

            Ori_arr[i] = num;
            Sorted_arr[i] = num;
        }
    }

    static void logic() {
        Arrays.sort(Sorted_arr);

        for (int i = 3; i < Sorted_arr.length; i++) {
            int findNum = Sorted_arr[i];
            sum += findNum;
        }

        sb.append(sum).append('\n');

        for (int i = 3; i < Sorted_arr.length; i++) {
            int findNum = Sorted_arr[i];
            for (int idx = 0; idx < Ori_arr.length; idx++) {
                if (findNum == Ori_arr[idx]) {
                    tempArr[idx] = idx + 1;
                }
            }
        }

        Arrays.sort(tempArr);

        for (int i = 3; i < tempArr.length; i++) {
            sb.append(tempArr[i]).append(" ");
        }

        System.out.println(sb);
    }
}