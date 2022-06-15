import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = new int[5];

        int j = 0;

        for (int i : score) {
            score[i] = Integer.parseInt(br.readLine());
            if (score[i] < 40) {
                score[i] = 40;
            }
            j += score[i];

        }
        System.out.println(j / 5);

    }
}
