class Solution {
    static int cnt = 0;
    public int solution(int[] array, int n) {
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                cnt++;
            }    
        }
        
                
        return cnt;
    }
}