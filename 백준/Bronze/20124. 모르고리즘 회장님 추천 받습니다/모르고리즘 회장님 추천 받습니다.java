import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static StringTokenizer st;
    static BufferedReader br;
    static int N;
    static ArrayList<Member> memberArrays;


    static class Member {

        String name;
        int score;

        public Member(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        memberArrays = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Member member = new Member(st.nextToken(), Integer.parseInt(st.nextToken()));
            memberArrays.add(member);
        }
    }

    static void logic() {
        Collections.sort(memberArrays, new Comparator<Member>() {

            @Override
            public int compare(Member o1, Member o2) {

                if (o1.score > o2.score) {
                    return 1;
                }

                if (o1.score < o2.score) {
                    return -1;
                }

                return o2.name.compareTo(o1.name);
            }

        });
        sb.append(memberArrays.get(N - 1).name);

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

}