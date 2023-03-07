package Day9;

public class Enum_36 {
    /**
     * Enum - способ ограничения добавления какой-то информации(которую не нужно добавлять), с помощтю определенныъ типов
     *
     * Клнструкторы в Enum имеет модификатор доступа private
     */
    public static void main(String[] args) {
        Date dateToday = new Date(Month.February,Days.Tuesday);
        dateToday.whatDate();
        System.out.println(Days.Friday.getNumber());

    }
}
enum Month{
    January, February, March, April, May, June, July, August, September, October, November, December;
}
enum Days implements Example{
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    private int number;
     Days(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
class Date {
    Month month;
    Days days;

    public Date(Month month, Days days) {
        this.days = days;
        this.month = month;
    }

    public void whatDate() {
        switch (days) {
            case Monday -> System.out.print("Today is - " + Days.Monday + ", number day: " + days.getNumber());
            case Tuesday -> System.out.print("Today is - " + Days.Tuesday + ", number day: " + days.getNumber());
            case Wednesday -> System.out.print("Today is - " + Days.Wednesday + ", number day: " + days.getNumber());
            case Thursday -> System.out.print("Today is - " + Days.Thursday + ", number day: " + days.getNumber());
            case Friday -> System.out.print("Today is - " + Days.Friday + ", number day: " + days.getNumber());
            case Saturday -> System.out.print("Today is - " + Days.Saturday + ", number day: " + days.getNumber());
            case Sunday -> System.out.print("Today is - " + Days.Sunday + ", number day: " + days.getNumber());
        }
        switch (month) {
            case January -> System.out.println(", month is - " + Month.January);
            case February -> System.out.println(", month is - " + Month.February);
            case March -> System.out.println(", month is - " + Month.March);
            case April -> System.out.println(", month is - " + Month.April);
            case May -> System.out.println(", month is - " + Month.May);
            case June -> System.out.println(", month is - " + Month.June);
            case July -> System.out.println(", month is - " + Month.July);
            case August -> System.out.println(", month is - " + Month.August);
            case September -> System.out.println(", month is - " + Month.September);
            case October -> System.out.println(", month is - " + Month.October);
            case November -> System.out.println(", month is - " + Month.November);
            case December -> System.out.println(", month is - " + Month.December);
        }
    }
}
interface Example{
    int getNumber();
}
