import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int an, eyes;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        an = Integer.parseInt(br.readLine());
        eyes = Integer.parseInt(br.readLine());

        if (an >= 3 && eyes <= 4) System.out.println("TroyMartian");
        if (an <= 6 && eyes >= 2) System.out.println("VladSaturnian ");
        if (an <= 2 && eyes <= 3) System.out.println("GraemeMercurian ");
    }
}