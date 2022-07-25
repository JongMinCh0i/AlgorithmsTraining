import java.io.*;
import java.util.*;

public class Main {
    static Stack<Character> checkList = new Stack<>();
    static boolean[] visit = new boolean[4];
    static ArrayList<String> strings = new ArrayList<>();
    static String str;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        inputStack();
        input();
        logic();
    }


    static void inputStack() {
        checkList.add('C');
        checkList.add('P');
        checkList.add('C');
        checkList.add('U');
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        str = br.readLine();

        while (st.hasMoreTokens()) {
            strings.add(st.nextToken());
        }


    }

    static void logic() {
        for (int i = 0; i < strings.size(); i++) {
            String checkString = strings.get(i);
            for (int m = 0; m < checkString.length(); m++) {
                for (int k = 0; k < 4; k++) {
                    if (checkList.empty())
                        break;
                    if (checkString.charAt(m) == checkList.peek() && !visit[k]) {

                        if (visit[k]) break;

                        visit[k] = true;
                        checkList.pop();


                    }
                }
            }
        }

        if (!visit[0] || !visit[1] || !visit[2] || !visit[3]) {
            System.out.println("I hate UCPC");
        } else {
            System.out.println("I love UCPC");
        }
    }
}
