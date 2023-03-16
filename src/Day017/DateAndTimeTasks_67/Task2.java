package Day017.DateAndTimeTasks_67;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
    /**
     * Создать обьект LocalDate прдеставляющий сегодняшнюю дату. Преобразовать дату в строку "05.05.2017".
     * Вывести эту строку на консоль
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(dateTimeFormatter.format(date));
    }
}
