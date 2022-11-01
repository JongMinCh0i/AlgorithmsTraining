
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        int month=Integer.parseInt(st.nextToken());
        int day=Integer.parseInt(st.nextToken());
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int s=0;
        for(int i=0;i<month-1;i++){
            s+=arr[i];
        }
        s+=day;
        s=s%7;
        if(s==1)
            sb.append("MON");
        else if(s==2)
            sb.append("TUE");
        else if(s==3)
            sb.append("WED");
        else if(s==4)
            sb.append("THU");
        else if(s==5)
            sb.append("FRI");
        else if(s==6)
            sb.append("SAT");
        else sb.append("SUN");
        System.out.println(sb);
    }
}
