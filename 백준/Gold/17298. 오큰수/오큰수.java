import java.io.*;
import java.util.*;

// 바로 수열을 탐색하면서 현재 원소가 이전의 원소보다 작을 때 까지 stack에 수열의 index를 stack에 추가(push) 하는 것이다.
// 그리고 만약 현재 원소가 스택의 top 원소를 인덱스로 하는 수열의 원소보다 크게 될 경우 stack의 원소를 pop하면서 해당 인덱스에 해당하는 원소들을 현재 원소로 바꿔주는 것이다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();   // 스택
        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];            // 정답 수열
        int[] arr = new int[N];               // 기본 수열

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        stk.push(0);

        for (int i = 1; i < N; i++) { // 0 번째 index에 해당하는 value가 넘어갔으므로 1부터 탐색 시작
            // 스택이 비어 있지 않고 현재 수열이 스태 top 인덱스가 가리키는 수열보다 클 경우
            while (!stk.empty() && arr[stk.peek()] < arr[i]) {
                answer[stk.pop()] = arr[i];
            }
            // 현재 수열을 스택에 push
//            stk.push(arr[i]);
            stk.push(i);
        }
        while (!stk.empty()) {
            answer[stk.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(answer[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
