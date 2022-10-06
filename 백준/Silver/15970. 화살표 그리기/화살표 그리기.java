import java.io.*;
import java.util.*;

public class Main {
    // 점의 색, 갯수를 정렬하기 위해 2차월 배열이 아닌
    // 점의 색(Color)을 인덱스로, 점의 위치(idx)를 value 설정

    static ArrayList<Integer>[] pointArr;

    // N 점의 갯수를 전역 변수로 설정

    static int N;

    // 왼쪽 점 과의 거리
    static int toLeft(int color, int point) {   // 컬러와 포인터를 파라미터로 실행 리턴형 int
        if (point == 0) {                       // 정렬했을 때 제일 왼쪽에 있는 point라면 뺄 친구가 없다.
            return Integer.MAX_VALUE;           // return Integer.MAX_VALUE
        }
        // 리턴 (파라미터로 들어온 pointArr[컬러].좌표 - pointArr[컬러].좌표( - 1 : 좌측) )
        return pointArr[color].get(point) - pointArr[color].get(point - 1);
    }

    static int toRight(int color, int point) {
        // 색깔이 color 인 점의 point 번째에 있는 점이 오른쪽으로 화살표를 그린다면 화살표의 길이를 return 하는 함수
        // 오른쪽에 있는 점이 컬러의 갯수와 동일하다면 무한대를 return
        // pointArr[color] 가 1부터 시작했기에 point + 1이 color의 사이즈와 같다면 // 끝이라면 return 무한대
        if (point + 1 == pointArr[color].size()) {
            return Integer.MAX_VALUE;
        }
        // 리턴 (파라미터로 들어온  pointArr[컬러].좌표( + 1 : 우측) - pointArr[컬러].좌표)
        return pointArr[color].get(point + 1) - pointArr[color].get(point);
    }
    // 우측 점과의 거리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 1. N개의 점을 나타내는 정수 N 이 주어진다.
        N = Integer.parseInt(br.readLine());
        // 2. N + 1개의 인덱스 생성
        pointArr = new ArrayList[N + 1];

        // 1부터 N까지의 ArrayList를 생성
        for (int color = 1; color <= N; color++) {
            pointArr[color] = new ArrayList<>();
        }

        // 1부터 N 까지 반복하며
        for (int i = 1; i <= N; i++) {

            st = new StringTokenizer(br.readLine());

            int color, point;
            point = Integer.parseInt(st.nextToken());  // 좌표 입력
            color = Integer.parseInt(st.nextToken());  // 색 입력

            // 모든 value는 앞으로 변수로 초기화 해서 넣을 것 : 장점 순서에 관여하지 않아도 됨
            // 제일 문제가 됐던 코드
//            int point = Integer.parseInt(st.nextToken());
//            int color = Integer.parseInt(st.nextToken());

            pointArr[color].add(point);  // 컬러별 좌표를 입력한다.
//            pointArr[color]에 ArrayList 생성
//            pointArr[color] = new ArrayList<>();

        }

        for (int color = 1; color <= N; color++)    // 1부터 N 까지
            Collections.sort(pointArr[color]); // pointArr[color] = ArrayList 이다. PointArr != ArrayList
        int ans = 0;                                // 답
        for (int color = 1; color <= N; color++) {  // 1부터 N까지
            for (int i = 0; i < pointArr[color].size(); i++) {// 0부터 pointArr[color]의 사이즈 까지 (끝까지)
                int left_distance = toLeft(color, i);         // 왼쪽 거리
                int right_distance = toRight(color, i);       // 우측 거리
                ans += Math.min(left_distance, right_distance); // 두 수 중에서 작은 값을 ans에 더해간다.
            }
        }
        System.out.println(ans); // 출력

    }
}