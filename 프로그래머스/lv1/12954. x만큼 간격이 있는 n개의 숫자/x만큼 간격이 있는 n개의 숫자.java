class Solution {
    
    static long k = 0;
    
    public long[] solution(int x, int n) {
    
        long[] answer = new long[n]; 
        
        for(int i = 0; i < n; i++) {
                        
            answer[i] = x * ++k;
            
        }
         
        return answer;
    }
}