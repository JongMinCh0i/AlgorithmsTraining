import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M, V;

    public static void main(String[] args) throws IOException {

        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        if (N == M && M == V) {sb.append("*");}
        if (N == M && M != V) {sb.append("C");}
        if (N != M && M == V) {sb.append("A");}
        if (N == V && M != V) {sb.append("B");}

        System.out.println(sb);
    }
}

