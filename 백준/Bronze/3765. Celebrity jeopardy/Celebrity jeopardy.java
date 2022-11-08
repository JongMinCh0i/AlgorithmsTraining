import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
        
    public static void main(String[]args)throws IOException{
       
         br = new BufferedReader(new InputStreamReader(System.in));
         sb = new StringBuilder();

        String str = ""; 

        while((str = br.readLine()) != null) {
            sb.append(str).append('\n');
        }

        System.out.println(sb);
    }
}