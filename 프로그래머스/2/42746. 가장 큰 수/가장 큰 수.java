import java.util.Arrays;

class Solution {

    public String solution(int[] numbers) {

        String[] str = Arrays.stream(numbers)
                                    .mapToObj(String::valueOf)
                                    .toArray(String[]::new);

        Arrays.sort(str, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        // 모든 숫자가 0인 경우 "0" 반환
        if (str[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String number : str) {
            sb.append(number);
        }

        return sb.toString();
    }
}
