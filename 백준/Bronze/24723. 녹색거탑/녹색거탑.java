import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
    }
    static void logic(){
        int x=2;
        for(int i=0;i<N-1;i++){
            x=x*2;
        }
        sb.append(x);
        System.out.println(sb);
    }
}
