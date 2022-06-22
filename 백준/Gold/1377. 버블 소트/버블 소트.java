import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
//        int[] arr = new int[A];
        Point[] arr = new Point[A];
        for (int i = 0; i < A; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
            arr[i] = new Point(Integer.parseInt(br.readLine()), i);
        }

        Arrays.sort(arr);

        int max = 0;
        for (int i = 0; i < A; i++) {
            if (max < arr[i].index - i ) {
                max = arr[i].index - i;

            }
        }
        System.out.println(max + 1);
    }
}

class Point implements Comparable<Point> {
    int value;
    int index;

    public Point(int value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(Point o) {
        return this.value - o.value;
    }
}