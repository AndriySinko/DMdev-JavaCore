package Day6.Tasks_21;

public class Task1 {
    /**
     * Создать класс описывающий промежуток времени.
     * Сам промежуток времени должен задаваться 3 параметрами:
     * секунды, минуты, часы
     * Создать метод для получения полного количесвта секунд в обьекте.
     * Создать два конструкторы:
     * 1.В который задается общее кол-во секунд
     * 2.Часы, минуты, секунды по отдельности
     * Создать метод который выводит данные.
     */
    public static void main(String[] args) {
        TimeInterval interval1 = new TimeInterval(66200);
        System.out.println("Total second in interval1 : "+interval1.totalSeconds());
        interval1.info();
        System.out.println();

        TimeInterval interval2 = new TimeInterval(5000,300,12);
        System.out.println("Total second in interval2 : "+interval2.totalSeconds());
        interval2.info();
    }
}
class TimeInterval{
    private int hour;
    private int minutes;
    private int seconds;
    public TimeInterval(int seconds){
        this.seconds = seconds %3600%60 ;
        this.hour = seconds/3600;
        this.minutes = seconds%3600/60;
    }
    public TimeInterval(int seconds, int minutes, int hour){
        this.seconds = seconds;
        this.hour = hour;
        this.minutes = minutes;
    }
    public int totalSeconds(){
        return  seconds + minutes*60 + hour*60*60;
    }
    public void info(){
        System.out.println("Seconds: "+seconds+"\nMinutes: "+minutes+"\nHours: "+hour);
    }
}