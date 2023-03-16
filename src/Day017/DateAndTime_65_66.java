package Day017;

import java.time.*;

public class DateAndTime_65_66 {
    /**
     * В джаве 8 были добавленые новые классы которые хранят время, которые пришли на замену старым, они намного точнее
     * и хранят больше информации, имеют новые методы.
     *
     * 1. ZonedDateTime - хранит всю информацию (Время, Дату, Сдвиг по времени, Зону)
     * 2. Instant - представляет точку на временной шкале от начальной точки, (Дат и время)
     *
     * 3. LocalDate - харнит только дату
     * 4. LocalTime - хранит только время
     * 5. LocalDateTime - хранит дату и время
     *
     * 6.OffsetTime - хранит время и сдиг времени по зоне
     * 7.OffsetDateTime - хранит дату, время и сдиг времени по зоне
     *
     * Для длительности используются:
     *
     * 1.Period - прдеставляет длительности в днях месяцах и годах
     * 2.Duration - придеставляет длительность в виде секунд, а доли секунд в форме наносекунд
     *
     * DateTimeFormater - класс который определяет нацтройки форматирования и парсинга времени.
     */
    public static void main(String[] args) {
        ZonedDateTime time1 = ZonedDateTime.now();
        System.out.println("Вся информация: "+time1);

        Instant time2 = Instant.now();
        System.out.println("Дата и время: "+time2);

        LocalTime time3 = LocalTime.now();
        LocalDate time4 = LocalDate.now();
        LocalDateTime time5 = LocalDateTime.of(time4, time3);
        System.out.println("LocalTime: "+time3+"\nLocalDate: "+time4+"\nLocalDateTime: "+time5);

        LocalDate start = LocalDate.of(2000,1,5);
        LocalDate end = LocalDate.now();
        Period period = Period.between(start,end);
        System.out.println(period);
        long days = period.getDays();
        long month = period.getMonths();
        long years = period.getYears();
        System.out.println(days+" "+month+" "+years);
    }
}
