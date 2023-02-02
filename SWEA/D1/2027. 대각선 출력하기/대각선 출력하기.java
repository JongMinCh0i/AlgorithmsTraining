import java.io.*;

public class Solution {
    static StringBuilder sb;

    public static void main(String[] args) {
        sb = new StringBuilder();

        sb.append(
                "#++++\n" +
                        "+#+++\n" +
                        "++#++\n" +
                        "+++#+\n" +
                        "++++#"
        );

        System.out.println(sb);
    }
}