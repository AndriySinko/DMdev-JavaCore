package Day017.DateAndTimeTasks_67;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3 {
    /**
     * Дана строка "26-03-1968T09:24". Получить обьект LocalDateTime представляющий собой дату из этой строки
     */
    public static void main(String[] args) {
        String time = "26-03-1968T09:24";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(time,dateTimeFormatter);
        System.out.println(localDateTime);
    }
}
