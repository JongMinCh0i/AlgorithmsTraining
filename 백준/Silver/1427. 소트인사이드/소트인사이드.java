import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> starr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            String st = str.substring(i, i + 1);
            starr.add(st);
            starr.sort(Collections.reverseOrder());
        }

        for (int j = 0; j < starr.size(); j++) {
            sb.append(starr.get(j));
        }

        System.out.println(sb);
    }
}