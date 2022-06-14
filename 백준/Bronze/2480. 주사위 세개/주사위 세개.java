import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int str1 = Integer.parseInt(st.nextToken());
        int str2 = Integer.parseInt(st.nextToken());
        int str3 = Integer.parseInt(st.nextToken());

        // 같은 눈 3 : 10000 + 같은 눈 * 1000원
        if ((str1 == str2) && (str1 == str3)) {
            System.out.println(10000 + (str1 * 1000));
        } // 같은 눈 2 : 1000 + (같은 눈) * 100원
        else if ((str1 == str2) || (str2 == str3) || str1 == str3) {
            if (str1 == str2) {
                System.out.println(1000 + (str1 * 100));
            } else if (str2 == str3) {
                System.out.println(1000 + (str2 * 100));
            } else {
                System.out.println(1000 + (str3 * 100));
            }
        }   // 같은 눈 0 가장 큰 눈 * 100원
        else {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(str1);
            arr.add(str2);
            arr.add(str3);

            Collections.sort(arr);

            System.out.println(arr.get(2) * 100);
        }
    }
}
