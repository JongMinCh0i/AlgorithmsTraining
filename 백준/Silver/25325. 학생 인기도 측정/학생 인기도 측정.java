import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int N;
    static String[] names;
    static int[] namesCnt;
    static ArrayList<String> lists;
    static name[] ansArr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ansArr = new name[N];
        st = new StringTokenizer(br.readLine());
        names = new String[N];
        namesCnt = new int[N];
        lists = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = st.nextToken();
            names[i] = name;
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                lists.add(st.nextToken());
            }
        }
    }


    static void logic() {

        Arrays.sort(names);
        Collections.sort(lists);

        for (int i = 0; i < N; i++) {
            String target = names[i];

            for (int j = 0; j < lists.size(); j++) {
                String match = lists.get(j);

                if (target.equals(match)) {
                    namesCnt[i]++;
                }
            }
            ansArr[i] = new name(names[i], namesCnt[i]);
        }




        Arrays.sort(ansArr);

        for (int i = 0; i < N; i++) {
            sb.append(ansArr[i].name).append(" ").append(ansArr[i].cnt).append('\n');
        }
        System.out.print(sb);
    }

    static class name implements Comparable<name> {
        String name;
        int cnt;


        public name(String name, int cnt) {
            this.name = name;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(name o) {
            if (this.cnt == o.cnt)  return this.name.compareTo(o.name);
            return o.cnt - this.cnt;
        }
    }
}

