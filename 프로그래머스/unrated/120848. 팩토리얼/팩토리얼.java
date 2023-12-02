class Solution {

    public static int solution(int n) {
        int answer = 0;
        while (true) {
            if (getFactor(answer) <= n) {
                answer++;
            } else {
                return answer - 1;
            }
         }
    }

    private static int getFactor(int k) {
        if (k <= 1) {
            return k;
        } else {
            return getFactor(k - 1) * k;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(7));
    }
}