import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        B[] bArr = new B[N];
        int[] P = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            bArr[i] = new B();
            bArr[i].num = Integer.parseInt(st.nextToken());
            bArr[i].idx = i;
        }

        Arrays.sort(bArr);

        // sortArr의 값을 이용해서 P 배열채우기
        for (int i = 0; i < P.length; i++) {
            // 핵심
            P[bArr[i].idx] = i;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(P[i] + " ");
        }
    }


    static class B implements Comparable<B> {

        // index , value
        int idx, num;

        @Override
        public int compareTo(B o) {
            if (num != o.num) {
                return num - o.num;
            }
            return idx - o.idx;
        }
    }
}