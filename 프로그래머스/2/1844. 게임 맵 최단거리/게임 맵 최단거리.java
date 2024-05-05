import java.util.*;

class Solution {
    static class Point {
        int x, y, dist;
        
        public Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0, 1));
        maps[0][0] = 0; // mark as visited
        
        while (!queue.isEmpty()) {
            Point current = queue.poll();
            int x = current.x;
            int y = current.y;
            int dist = current.dist;
            
            if (x == n - 1 && y == m - 1) {
                return dist;
            }
            
            for (int[] dir : dirs) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1) {
                    queue.offer(new Point(nx, ny, dist + 1));
                    maps[nx][ny] = 0;
                }
            }
        }
        
        return -1;
    }
}
