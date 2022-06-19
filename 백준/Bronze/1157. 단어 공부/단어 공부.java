import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                alphabet[str.charAt(i) - 'a']++;
            } else {
                alphabet[str.charAt(i) - 'A']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                ch = (char) (i + 65); // 대문자 변환
            } else if (alphabet[i] == max) { // 기존 int max 값과 i 번째 인덱스의 값이 같을 경우(aabb)
                ch = '?';                    // ch를 다시 '?' 로 초기화
            }
        }

        System.out.println(ch);
    }
}