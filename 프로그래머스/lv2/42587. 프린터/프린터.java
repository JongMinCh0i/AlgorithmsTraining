import java.io.*;
import java.util.*;

class Solution {
    public static int solution(int[] priorities, int location) {
        int cnt = 1;

        Queue<Integer> idx = new LinkedList<>();
        Queue<Integer> pri = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            idx.add(i);
            pri.add(priorities[i]);
        }

        while (!idx.isEmpty()) {
            int max = Collections.max(pri);
            int cur = pri.poll();
            int curIdx = idx.poll();

            if (cur == max) {
                if (curIdx == location) {
                    return cnt;
                }
                cnt++;
            } else {
                pri.add(cur);
                idx.add(curIdx);
            }
        }
        return cnt;
    }   
}