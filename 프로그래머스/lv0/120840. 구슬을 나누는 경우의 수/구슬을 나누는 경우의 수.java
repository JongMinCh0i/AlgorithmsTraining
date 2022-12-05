import java.math.*;

class Solution {
    static BigInteger answer;

    public static BigInteger fac(long N) {
        long num = 1;

        if (N == 0 || N == 1) {
            return BigInteger.valueOf(1);
        }

        return BigInteger.valueOf(N).multiply(fac(N - 1));
    }

    public BigInteger solution(long balls, long share) {
        long K = balls - share;

        answer = fac(balls).divide(fac(K).multiply(fac(share)));

        return answer;
    }
}