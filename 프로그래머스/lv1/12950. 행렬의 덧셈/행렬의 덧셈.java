class Solution {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0; i < arr1.length; i++) {            
            for(int j = 0; j < arr1[0].length; j++){
                
               int x1 = arr1[i][j];
                int x2 = arr2[i][j]; 
                
                answer[i][j] = x1 + x2; 
            }
        }
        
        
        return answer;        
    }
}