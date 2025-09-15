package week1.dates_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateChecker {

    public static void main(String[] args) {
        String[] sampleDates = { "2024-09-13", "2024-12-13", "2024-11-13", "2024-09-14" };
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (String s : sampleDates) {
            LocalDate d = LocalDate.parse(s, fmt);
            System.out.printf("%s: %s%n", s,
                    (isFridayThe13th(d) ? "YES, it's Friday the 13th" : "No"));
        }
    }

    public static boolean isFridayThe13th(LocalDate date) {
        return date.getDayOfMonth() == 13 && date.getDayOfWeek().getValue() == 5;
    }

}

