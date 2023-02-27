import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int[][] arr;
    static int num = 0;
    static int Row, Column;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void logic() {

        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int temp = arr[i][j]; // 기본 맥스 값

                if (num < temp) {
                    num = temp;

                    Row = i;
                    Column = j;
                }
            }
        }


        sb.append(num).append('\n');
        sb.append(Row + 1).append(" ").append(Column + 1);
        System.out.println(sb);
    }
}
