import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        List<Sort> newList = new ArrayList<>();

        String str;

        for (int j = 0; j < N; j++) {
            str = br.readLine();
            set.add(str);
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            newList.add(new Sort(iterator.next()));
        }

        Collections.sort(newList);

        for (int i = 0; i < newList.size(); i++) {
            sb.append(newList.get((i)).str).append('\n');
        }
        
        System.out.println(sb);
    }

    static class Sort implements Comparable<Sort> {

        String str;

        public Sort(String str) {
            this.str = str;
        }

        @Override
        public int compareTo(Sort o) {
            if (str.length() == o.str.length()) {
                return str.compareTo(o.str);
            }
            return (str.length() - o.str.length());
        }
    }
}

