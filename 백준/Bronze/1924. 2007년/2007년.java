import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Month = Integer.parseInt(st.nextToken());
        int Day = Integer.parseInt(st.nextToken());

        int[] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int totalDays = Day;
        
        for (int i = 0; i < Month - 1; ++i) {
            totalDays += lastDay[i];
        }

        System.out.println(day[totalDays % 7]);
    }
}
