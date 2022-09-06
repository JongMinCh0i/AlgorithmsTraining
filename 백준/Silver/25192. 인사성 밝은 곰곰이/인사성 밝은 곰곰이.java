import java.io.*;
import java.util.*;

// ENTER 가 찍히고 나서 SEt<String> 값 입력
// ENTER 가 다시 입력 된다면 지금까지의 SET<String> 의 size 더하기

public class Main {
    static int N, cnt, entCNT;

    static BufferedReader br;
    static StringBuilder sb;
    static HashSet<String> name;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        name = new HashSet<>();
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.equals("ENTER")) {
                entCNT++;
                cnt += name.size();
                name.clear();
            }
            if (!str.equals("ENTER")) {
                name.add(str);
            }
        }
        if (entCNT == 1) {
            System.out.println(name.size());
        } else {
            System.out.println(cnt + name.size());
        }

    }
}

