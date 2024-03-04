import java.io.*;
import java.util.*;

class Solution {
    
    static int cnt = 0;
    
    // 범위 이내 확인 현재 원점이 55 라고 생각하고 다시 해보자.
    public static boolean validRange(int nx, int ny) {
        return (0 <= nx && nx <= 10) && (0 <= ny && ny <= 10);
    }    
      
    private static final HashMap<Character, int[]> location = new HashMap<>();
        
    private static void initLocation() {
            location.put('U', new int[]{0,1});
            location.put('D', new int[]{0,-1});
            location.put('R', new int[]{1,0});
            location.put('L', new int[]{-1,0});
    }
    
    public int solution(String dirs) { 
        initLocation();
        int x = 5, y = 5; // 초기 값
        HashSet<String> answer = new HashSet<>(); 
        
        for(int i = 0; i < dirs.length(); i++) {
            int [] offset = location.get(dirs.charAt(i));
            
            int nx = x + offset[0];
            int ny = y + offset[1];
            if(!validRange(nx, ny)) {
                continue;
            }
            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);
               
               x = nx;
               y = ny;
        }
               return answer.size() / 2;
    }
}
              