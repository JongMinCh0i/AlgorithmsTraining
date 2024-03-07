import java.io.*;
import java.util.*;
class Solution {
    private static final int ENDJOB = 100;

    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int[] daysNeeded = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int remaining = ENDJOB - progresses[i];
            daysNeeded[i] = remaining % speeds[i] == 0 ? remaining / speeds[i] : remaining / speeds[i] + 1;
        }

        int currentDay = 0;
        int count = 0;
        for (int i = 0; i < progresses.length; i++) {
            if (daysNeeded[i] > currentDay) {
                answer.add(count);
                count = 1;
                currentDay = daysNeeded[i];
            } else {
                count++;
            }
        }
        answer.add(count);
        answer.remove(0);

        return answer;
    }
}
