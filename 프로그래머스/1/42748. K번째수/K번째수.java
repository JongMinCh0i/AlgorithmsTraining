
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answerList = new ArrayList<>();

        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];

            // 배열 자르기
            int[] slicedArray = Arrays.copyOfRange(array, i - 1, j);
            // 자른 배열 정렬
            Arrays.sort(slicedArray);
            // k번째 숫자를 answer에 추가
            answerList.add(slicedArray[k - 1]);
        }

        // List를 배열로 변환하여 반환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
