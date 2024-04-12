/*
생각할 지점,
1.init 을 통해서 2차원 배열을 List<Stack<Integer>> 로 변경하고 해당 값들을 담는다
2.moves를 통해 해당 idx 의 List 에 위치한 Stack 의 Integer 를 하나씩 꺼내고 이를 바구니에 담는다.
3.바구니(stack)에 담기 직전 해당 바구니에서 top 과 담을 Integer를 비교 하고 같을 경우 pop 하고 이를 카운팅 한다.
*/

import java.util.*;

class Solution {
    public static Stack<Integer> basket = new Stack<>();
    public static int answer = 0;
    
    public int solution(int[][] board, int[] moves) {
        List<Stack<Integer>> boardList = new ArrayList<Stack<Integer>>();    
        int listSize = board[0].length;

        for(int i = 0; i < listSize; i++) {
            boardList.add(i, new Stack<Integer>()); // ArrayList 문법. 주의!!
        }
        
        for(int i = 0; i < listSize; i++) {
            int[] boardRow = board[listSize - (i + 1)]; // 4 3 2 1 0
            
            for(int j = 0; j < boardRow.length; j++) {
                Stack<Integer> stk = boardList.get(j);
                if(boardRow[j] != 0) stk.push(boardRow[j]);
            }
        }
        
        // moves를 통해 해당 idx 의 List 에 위치한 Stack 의 Integer 를 하나씩 꺼내서 바구니 담음
        for(int i = 0; i < moves.length; i++) {
            int point = moves[i];
            Stack<Integer> boardStk = boardList.get(point - 1);
            
            if(boardStk.isEmpty()) continue;
            Integer cand = boardStk.pop();
            
            if(!basket.isEmpty() && basket.peek().equals(cand)) {
                basket.pop();
                answer+=2;
            } else {
                basket.push(cand);
            }
        }
        return answer;
    }
}