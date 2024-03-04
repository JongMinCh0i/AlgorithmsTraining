class Solution {
    static int cnt = 0;
    
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[num_list.length];
        
        for(int i = num_list.length - 1; i >= 0; i--) {
            answer[cnt] = num_list[i];
                cnt++;
        }
        
        return answer;
    }
}
