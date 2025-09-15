package week1.dates_and_time;

import java.time.YearMonth;
import java.time.Month;

public class MonthLengths {

    public static void main(String[] args) {
        int year = 2025;
        printMonthLengths(year);
    }

    public static void printMonthLengths(int year) {
        System.out.println("Month lengths for year " + year + ":");
        for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(year, month);
            int length = ym.lengthOfMonth();
            System.out.printf("%-9s: %2d days%n", month, length);
        }
    }
}

