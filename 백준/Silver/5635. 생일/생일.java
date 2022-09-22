

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N;
    static List<Student> Students;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int Day = Integer.parseInt(st.nextToken());
            int Month = Integer.parseInt(st.nextToken());
            int Year = Integer.parseInt(st.nextToken());

            Students.add(new Student(name, Day, Month, Year));
        }
    }

    static void logic() {
        Collections.sort(Students);

        sb.append(Students.get(Students.size() - 1).name).append("\n");
        sb.append(Students.get(0).name).append("\n");

        System.out.println(sb);
    }

    static class Student implements Comparable<Student> {
        String name;
        int Day, Month, Year;

        public Student(String name, int day, int month, int year) {
            this.name = name;
            Day = day;
            Month = month;
            Year = year;
        }

        @Override
        public int compareTo(Student other) {
            if (this.Year != other.Year) return this.Year - other.Year;
            if (this.Month != other.Month) return this.Month - other.Month;
            if (this.Day != other.Day) return this.Day - other.Day;
            return 0;
        }
    }
}