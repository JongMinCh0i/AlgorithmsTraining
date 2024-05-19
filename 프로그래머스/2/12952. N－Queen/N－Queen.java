class Solution {
    private int cnt = 0;

    public int solution(int n) {
        cnt = 0;
        int[] positions = new int[n];
        init(positions, 0, n);
        return cnt;
    }

    private void init(int[] positions, int target, int n) {
        if (target == n) {
            cnt++;
            return;
        }

        for (int column = 0; column < n; column++) {
            if (valid(positions, target, column)) {
                positions[target] = column;
                init(positions, target + 1, n);
            }
        }
    }

    private boolean valid(int[] positions, int row, int column) {
        for (int i = 0; i < row; i++) {
            int pos = positions[i];
            // 같은 열, 대각선(11시 , 5시), (1시, 7시)
            if (pos == column || pos - i == column - row || pos + i == column + row) {
                return false;
            }
        }
        return true;
    }
}
