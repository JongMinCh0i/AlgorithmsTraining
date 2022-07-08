//중복된 값을 허용하지 않음
//입력한 순서가 보장되지 않음
//null을 값으로 허용

import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static HashSet<Integer> A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            Integer num = Integer.parseInt(st.nextToken());

            if (A.contains(num)) {
                A.remove(num);
            } else {
                A.add(num);
            }
        }
        System.out.println(A.size());
    }
}