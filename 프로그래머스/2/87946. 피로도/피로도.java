class Solution {
    private int max = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        exploreDungeons(k, dungeons, visited, 0);
        return max;
    }

    private void exploreDungeons(int k, int[][] dungeons, boolean[] visited, int count) {
        max = Math.max(max, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                exploreDungeons(k - dungeons[i][1], dungeons, visited, count + 1);
                visited[i] = false;
            }
        }
    }
}