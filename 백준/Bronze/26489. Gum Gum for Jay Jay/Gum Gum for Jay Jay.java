import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int CNT = 0;
        while (sc.hasNextLine()) {
            String tmp = sc.nextLine();
            if (tmp.equals("gum gum for jay jay")) CNT++;
            if (tmp == null && !tmp.isEmpty()) break;
        }

        System.out.println(CNT);
    }
}

