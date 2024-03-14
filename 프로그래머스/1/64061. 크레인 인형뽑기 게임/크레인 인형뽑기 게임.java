/*
hint : 장바구니는 stack으로 정의 해서 값을 놓기전에 Stack 의 값이 있다면! top의 값과 둘 값을 비교하여 
같으면 pop 하고 count + 2 처리한다. 

풀이 방법 1. 
board의 가로 row 값 만큼 stack을 생성함
이후 해당 board를 O(n^2) 만큼 순회하면서 각 column에 맞는 인형을 잡아서 보관함에 넣어서 peek 과 비교
*/

import java.util.*;

class Solution {                
    public int solution(int[][] board, int[] moves) {
        int gameCounter = 0;
        
        // 게임 세팅
        ArrayDeque<Integer> scoreStack = new ArrayDeque<>();
        List<Stack<Integer>> boards = new ArrayList<>();
        
        int rowNumber = board[0].length;
        
        for(int i = 0; i < rowNumber; i++){
            boards.add(new Stack<Integer>());
        }
        
        for(int i = rowNumber - 1; i >= 0; i--) {
            int[] arr = board[i];
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == 0) continue;
                boards.get(j).push(arr[j]);
            }
        }

        // 게임 진행
        for(int i = 0; i < moves.length; i++) { 
            Stack<Integer> singleBoard = boards.get(moves[i] - 1);
            
            // 비어있으면 뽑을게 없으니까 continue;
            if(singleBoard.isEmpty()) continue;
            
            // 사이즈가 있으면 뽑는다.
            Integer doll = singleBoard.pop();
            
             // 만약에 스코어 스택이 1개 이상일 경우 같이 만나서 터질 수 있을 가능성이 있음 -> 검사 진행
             // 새롭게 뽑은 인형과 현재 스코어 스택 top과 비교!
            
            if(!scoreStack.isEmpty()) {
                Integer doll2 = scoreStack.peek();
                
               if(doll.equals(doll2)) {
                    scoreStack.pop();
                    gameCounter += 2;
                    continue;
                }
            }
            scoreStack.push(doll);
        }
        
        return gameCounter;
    } 
}
