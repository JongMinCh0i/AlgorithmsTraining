
import java.io.*;
import java.util.*;

public class Main {
    static int cnt = 1; // 카운트 횟수
    static int temp = 0; // 임시 값
    static String L, R, newNUM, subtemp = " "; // 10의자리, 1의 자리 숫자 , 정해진 숫자,

    public static void fun(String N) {
        final int num = Integer.parseInt(N);
        while (true) {
            if (N.length() == 1) {
                N = String.valueOf(0).concat(N);
            }
            L = N.substring(0, 1);
            R = N.substring(1, 2);
            temp = Integer.parseInt(L) + Integer.parseInt(R);
            if (temp > 9) {                            // 임시 값이 9이상이라면(10의 자리 숫자라면) 해당 임시값의 1의 자리 숫자를 subtemp저장
                subtemp = String.valueOf(temp).substring(1, 2);
            } else {
                subtemp = String.valueOf(temp);        // 1의 자리 숫자 리턴
            }
            if (R.equals("0") && (L.equals("0"))) { // 1의 자리와 10의 자리가 둘다 0 일 경우 newNUM을 0으로 설정
                newNUM = "0";
            } else {
                newNUM = (R).concat(subtemp);
            }
            if ((num) == Integer.parseInt(newNUM)) { // 찾았을경우 cnt 출력하고 종료
                System.out.println(cnt);
                break;
            } else {
                N = newNUM;
                cnt++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        fun(N);
    }
}