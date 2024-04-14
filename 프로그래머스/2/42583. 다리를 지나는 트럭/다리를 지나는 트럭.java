import java.util.*;

class Solution {
    
    public static int answer = 0;
    public static int nowWeight = 0;
    public static Queue<Integer> bridge = new LinkedList<>();
    
    public static void logic(int bridge_length, int weight, int truck_weight) {
        
        // 각 트럭을 처리하는 로직
        while (true) {
            // 다리가 비었으면 트럭을 바로 보냄
            if (bridge.isEmpty()) {
                bridge.add(truck_weight);
                nowWeight += truck_weight;
                answer++;
                break;
            } else if (bridge.size() == bridge_length) {
                // 다리가 꽉 찼으면, 맨 앞 트럭을 제거
                nowWeight -= bridge.poll();
            } else {
                if (nowWeight + truck_weight <= weight) {
                    // 다리에 트럭 추가 가능
                    bridge.add(truck_weight);
                    nowWeight += truck_weight;
                    answer++;
                    break;
                } else {
                    // 다리에 트럭 추가 불가능, 0을 추가하여 시간을 증가시킴
                    bridge.add(0);
                    answer++;
                }
            }
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        for (int truck_weight : truck_weights) {
            logic(bridge_length, weight, truck_weight);
        }
        
        return answer + bridge_length;  // 마지막 트럭이 다리를 건너는 시간 추가
    }
}
