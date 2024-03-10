import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int ENDJOB = 100;
    private static int cnt = 0;
    private static int weight = 0;

    public List<Integer> solution(int[] progresses, int[] speeds) {
        int[] jobArr = new int[progresses.length];
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < jobArr.length; i++) {
            if (((ENDJOB - progresses[i]) % speeds[i]) == 0) {
                jobArr[i] = ((ENDJOB - progresses[i]) / speeds[i]);
            } else if ((ENDJOB - progresses[i]) % speeds[i] >= 1) {
                jobArr[i] = (int) ((ENDJOB - progresses[i]) / speeds[i]) + 1;
            }
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = jobArr.length - 1; i >= 0; i--) {
            stack.push(jobArr[i]);
        }

        while (!stack.isEmpty()) {
            int jobDuty = stack.pop();
            cnt++;
            weight = (jobDuty);

//            if (stack.isEmpty()) {
//                answer.add(cnt);
//                return answer;
//            }

            while (!stack.isEmpty() && stack.peek() <= weight) {
                stack.pop();
                cnt++;
            }

            answer.add(cnt);
            cnt = 0;
        }
        return answer;
    }
}
