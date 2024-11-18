import java.io.*;
import java.util.*;

class Solution {

    public int[] solution(int[] answers) {
        
        int[] temp = new int[3];
        int[] user1 = {1, 2, 3, 4, 5};
        int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int countScoreUser_1 = 0;
        int countScoreUser_2 = 0;
        int countScoreUser_3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == user1[i % user1.length]) countScoreUser_1++;
            if (answers[i] == user2[i % user2.length]) countScoreUser_2++;
            if (answers[i] == user3[i % user3.length]) countScoreUser_3++;
        }

        temp[0] = countScoreUser_1;
        temp[1] = countScoreUser_2;
        temp[2] = countScoreUser_3;

        int max_value = Math.max(temp[0], Math.max(temp[1], temp[2]));

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (temp[i] == max_value) {
                result.add(i + 1); 
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}
