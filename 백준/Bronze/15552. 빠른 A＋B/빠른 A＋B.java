import java.io.*;

public class Main {
    public static void main(String args[]) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
                try(BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))){
                int T = Integer.parseInt(bufferedReader.readLine());
                for(int i = 0; i < T; i++){
                    String values = bufferedReader.readLine();
                    int A = Integer.parseInt(values.split(" ")[0]);
                    int B = Integer.parseInt(values.split(" ")[1]);

                    bufferedWriter.write(A+B + "\n");
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}