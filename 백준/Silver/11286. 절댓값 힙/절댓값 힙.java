import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 조건 생성
        PriorityQueue<Integer> MyQueue1 = new PriorityQueue<>((o1, o2) -> {
            int leftNum = Math.abs(o1);
            int rightNum = Math.abs(o2);

            if (leftNum == rightNum)
                return o1 > o2 ? 1 : -1; 
            else
                return leftNum - rightNum;

        });

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            if (M == 0) {
                if (MyQueue1.isEmpty())
                    System.out.println("0");
                else
                    // 출력
                    System.out.println(MyQueue1.poll());
            } else {
                // 0이 아닐경우 값을 입력 한다.
                MyQueue1.add(M);
            }
        }
    }
}