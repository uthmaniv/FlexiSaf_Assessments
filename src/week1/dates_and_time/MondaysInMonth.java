package week1.dates_and_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class MondaysInMonth {

    public static List<LocalDate> getMondays(int month) {
        int year = LocalDate.now().getYear();
        YearMonth ym = YearMonth.of(year, month);
        List<LocalDate> mondays = new ArrayList<>();

        LocalDate date = ym.atDay(1);
        int dayShift = (DayOfWeek.MONDAY.getValue() - date.getDayOfWeek().getValue() + 7) % 7;
        LocalDate firstMonday = date.plusDays(dayShift);

        for (LocalDate d = firstMonday; d.getMonthValue() == month; d = d.plusWeeks(1)) {
            mondays.add(d);
        }
        return mondays;
    }

    public static void main(String[] args) {
        int month = 9;
        List<LocalDate> mondays = getMondays(month);
        System.out.println("Mondays in " + month + " of current year:");
        for (LocalDate m : mondays) {
            System.out.println(m);
        }
    }
}

