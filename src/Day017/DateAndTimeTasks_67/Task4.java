package Day017.DateAndTimeTasks_67;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Task4 {
    /**
     * Использовать LocalDateTime из предыдвущего задания, преобразовать в инстант и добавить зону America/Chicago,
     * вывести кол-во прошедших милисекунд
     */
    public static void main(String[] args) {
        String time = "26-03-1968T09:24";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(time,dateTimeFormatter);

        Instant instant = localDateTime.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(localDateTime));
        System.out.println(instant);
        System.out.println(instant.toEpochMilli());
    }
}
