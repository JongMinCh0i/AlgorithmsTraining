class Solution {
    
    static int answer = 0;
    
    public int solution(String[] s1, String[] s2) {
        for(int i = 0; i < s1.length; i++) {
            for(int j = 0; j< s2.length; j++) {
                if(s1[i].equals(s2[j])){
                  answer++;   
                }
            }
            
        }
        return answer;
    }

}