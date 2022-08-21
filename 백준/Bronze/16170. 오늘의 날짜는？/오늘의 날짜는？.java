import java.io.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        LocalDate now = LocalDate.now(ZoneId.of("GMT"));

        System.out.println(now.getYear());
        System.out.println("0" +now.getMonthValue());
        System.out.println(now.getDayOfMonth());
    }
}
