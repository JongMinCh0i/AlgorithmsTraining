import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int[] coin = {500, 100, 50, 10, 5, 1};
    static int cnt,  money;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        money = Integer.parseInt(br.readLine());
    }

    static void logic() {
        int exChange = 1000 - money;

        for (int i = 0; i < coin.length; i++) { // 총 6번을 수행한다. (동전의 종류가 6개라서)
            if (exChange >= coin[i]) { // 현재 갖고 있는 잔액이 코인의 현재 값보다 크거나 같을 경우 거스름돈을 줄 가치를 갖는다.
                int temp = exChange;
                int semicnt = temp / coin[i];
                exChange = exChange - (semicnt * coin[i]);
                cnt += semicnt;
            }

            if (exChange == 0) {
                sb.append(cnt);
                System.out.println(sb.toString());
                return;
            }
        }
    }
}