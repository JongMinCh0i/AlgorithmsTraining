import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 1. 티셔츠 1장과 펜 한 자루가 포함된 웰컴키트를 나눠줄 예정이다.
 * 2. 티셔츠는 6가지 종류가 있다(S, M, L, XL, XXL, XXXL)
 * 3. 펜은 한 종류로 P자루씩 묶음으로 주문하거나, 한 자루씩 주문할 수 있음
 * <p>
 * answer : 티셔츠를 T장씩 최소 몇 묶음 주문해야 하는지,
 * 펜을 P자루씩 최대 몇 묶음 주문할 수 있고, 그 때 펜을 한 자루씩 몇 개 주문하는가?
 *
 */
public class Main {
    static int i, k, m;
    static List<Integer> arr;
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    private static void logic() {
        int total = 0;

        for (Integer integer : arr) {

            // 몫 처리
            total += integer / k;

            // 나눗셈 처리
            if (integer % k >= 1) {
                total++;
            }
        }

        sb.append(total).append("\n");
        int pencilOfBundle = i / m;
        int pencil = i % m;

        sb.append(pencilOfBundle).append(' ').append(pencil);
        System.out.println(sb);
    }

    private static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        i = Integer.parseInt(br.readLine());

        arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }

}
