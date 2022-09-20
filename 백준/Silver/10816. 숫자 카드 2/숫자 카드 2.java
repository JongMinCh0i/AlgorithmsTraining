import java.io.*;
import java.util.*;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        // key 값에 입력받은 값을 
        // value 값에 순차적으로 증가하는 int i 를 (0..1...2..3..4..5)
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            // map.get(value) value를 통해 값을 입력 
            // 입력했던 값이 존재 하지 않는다면 value, 1 로 저장
            // 입력했던 값이 존재 했었다면 value, +1 로 저장
            if (map.get(value) == null) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int input = Integer.parseInt(st.nextToken());
            
            // input을 통해 받은 value가 키(input)로 존재하는지 존재한다면 키를 바탕으로 value 삽입  
            if (map.containsKey(input)) {sb.append(map.get(input)).append(" ");}
            // 해당 키가 존재 하지 않는다면 " " 저장
            else {sb.append(0).append(" "); }
            
//            if(map.get(input) == null) sb.append(0).append(" ");
//            else sb.append(map.get(input)).append(" ");
        }
        System.out.println(sb);
    }
}