import java.util.*;

class Solution {
    
    static class Node {
        int idx;
        int dist;
        
        public Node(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        // 각 마을까지의 최단 거리를 저장할 배열
        int[] distance = new int[N+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[1] = 0; // 시작 마을은 0으로 초기화
        
        // 인접 리스트를 이용한 그래프 생성
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] r 
             : road) {
            int a = r[0];
            int b = r[1];
            int c = r[2];
            graph.get(a).add(new Node(b, c));
            graph.get(b).add(new Node(a, c));
        }
        
        // BFS를 이용한 최단 거리 계산
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(1, 0));
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int curr = node.idx;
            int dist = node.dist;
            
            if (distance[curr] < dist) continue; // 이미 더 짧은 경로가 존재하면 스킵
            
            for (Node next : graph.get(curr)) {
                int nextIdx = next.idx;
                int nextDist = dist + next.dist;
                
                if (nextDist < distance[nextIdx]) {
                    distance[nextIdx] = nextDist;
                    queue.offer(new Node(nextIdx, nextDist));
                }
            }
        }
        
        // 배달 가능한 마을의 수 계산
        for (int i = 1; i <= N; i++) {
            if (distance[i] <= K) answer++;
        }
        
        return answer;
    }

}
