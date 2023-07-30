import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void logic() {
        Arrays.sort(arr);
        int sum=0;
        for (int a = 0; a < 3; a++) {
            for (int b = a+1; b < 4; b++) {
                for (int c = b+1; c < 5; c++) {
                    for (int d = c+1; d < 6; d++) {
                        for (int f = d+1; f < 7; f++) {
                            for (int e = f+1; e < 8; e++) {
                                for (int g = e+1; g < 9; g++) {
                                    sum=arr[a]+arr[b]+arr[c]+arr[d]+arr[f]+arr[e]+arr[g];
                                    if(sum==100) {
                                        sb.append(arr[a]).append('\n');
                                        sb.append(arr[b]).append('\n');
                                        sb.append(arr[c]).append('\n');
                                        sb.append(arr[d]).append('\n');
                                        sb.append(arr[f]).append('\n');
                                        sb.append(arr[e]).append('\n');
                                        sb.append(arr[g]);
                                        break;
                                    }
                                }
                                if(sum==100)
                                    break;
                            }if(sum==100)
                                break;
                        }
                        if(sum==100)
                            break;
                    }
                    if(sum==100)
                        break;
                }
                if(sum==100)
                    break;
            }
            if(sum==100)
                break;
        }
        System.out.println(sb);
    }
}
