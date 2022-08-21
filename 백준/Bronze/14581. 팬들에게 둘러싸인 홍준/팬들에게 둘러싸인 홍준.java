import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(":fan::fan::fan:\n" +

                ":fan::" + str + "::fan:\n" +

                ":fan::fan::fan:");
    }
}
