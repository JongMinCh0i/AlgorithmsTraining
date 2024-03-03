import java.io.*;
import java.util.*;

class Solution {
    
    static int[] number1_human = {1,2,3,4,5};
    static int[] number2_human = {2,1,2,3,2,4,2,5};
    static int[] number3_human = {3,3,1,1,2,2,4,4,5,5};
    static int[] score = {0,0,0};
    
    public int[] solution(int[] qna) {
        collect(qna, number1_human, 0);
        collect(qna, number2_human, 1);
        collect(qna, number3_human, 2);
             
        // 최대 값을 확인한다.
        int maxscore = Arrays.stream(score).max().getAsInt();
        
        // 값이 같으면 오름차순 정렬 
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < score.length; i++) {
            if(score[i] == maxscore) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static void collect(int[] qna, int answer[], int who){
         // 1,2,3,4,5 이후에도 문제가 늘어나면? 문제가 6문제지만 answer는 이미 5까지 다 가면 풀이가 안된다.
        
        for(int i = 0; i < qna.length; i++) { 
            int answer_idx = i % answer.length;
            
            if(qna[i] == answer[answer_idx]) {
                score[who]++;
            }
        }
    }    
}