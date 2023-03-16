package Day017.DateAndTimeTasks_67;

import java.time.LocalDate;
import java.time.Period;

public class Task5 {
    /**
     * Создать сегоднешнюю дату и 07.07.2018, и вывести колво дней между ними
     */
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2018,7,7);
        Period period = Period.between(date1,date2);
        System.out.println(period.getDays());
    }
}
