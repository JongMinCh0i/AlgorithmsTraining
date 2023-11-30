class Solution {
    
    private static final int COFFEE_PRICE = 5500;

    public int[] solution(int money) {
        int coffee_cnt = 0; 
        int change_price = 0; 
        
       coffee_cnt =  money / COFFEE_PRICE;
       change_price = money % COFFEE_PRICE;
        
        int[] answer = new int[2];
        
        answer[0] = coffee_cnt;
        answer[1] = change_price;
        return answer;
    }
}