import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 조건 생성
        PriorityQueue<Integer> MyQueue1 = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            if (M == 0) {
                if (MyQueue1.isEmpty())
                    System.out.println("0");
                else
                    // 출력
                    System.out.println(MyQueue1.poll());
            } else {
                MyQueue1.add(M);
            }
        }
    }
}