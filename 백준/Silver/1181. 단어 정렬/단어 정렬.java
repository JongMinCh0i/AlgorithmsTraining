// Set, Comparable, 정렬 기준,
// Set<Object> 의 경우 Collection.Sort()를 통해 Object 멤버 또한 정렬되는가

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int N;
    static List<Name> nameList;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        Set<String> setName = new HashSet<>();
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        nameList = new ArrayList<>();
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            setName.add(str);
        }

        Iterator<String> iterator = setName.iterator();

        while (iterator.hasNext()) {
            nameList.add(new Name(iterator.next()));
        }
    }

    static void logic() throws IOException {
        Collections.sort(nameList);

        for (int i = 0; i < nameList.size(); i++) {
            sb.append(nameList.get(i).str).append('\n');
        }

        System.out.println(sb);

    }

        static class Name implements Comparable<Name> {
            public String str;

            public Name(String str) {
                this.str = str;
            }

            @Override
            public int compareTo(Name o) {
                if (str.length() == o.str.length()) {
                    return str.compareTo(o.str);
                }

                return str.length() - o.str.length();

            }
        }
    }

