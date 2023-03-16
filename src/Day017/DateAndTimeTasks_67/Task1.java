package Day017.DateAndTimeTasks_67;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task1 {
    /**
     * Создать обьект LocalDateTime представляющий собой  дату 25.06.2020 19:47. Используя это обьект создать обьект
     * представляющий собой дату через 3 месяца после сегодняшней. Вывести в консоль содержащиеся в нем обьекты
     * LocalDate LocalTime
     */
    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.of(2020,6,25,19,47);
        LocalDateTime localDateTime2 = localDateTime1.plusMonths(3);
        LocalDate date = localDateTime2.toLocalDate();
        LocalTime time = localDateTime2.toLocalTime();
        System.out.println(date+"\n"+time);
    }
}
