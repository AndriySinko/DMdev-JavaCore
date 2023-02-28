package Day2.Tasks_6;

public class Task4 {
    /**
     * Написать программу которая считывает высокосный год
     * Это такой год который делится на 4 без остатка, но если одновременно с этим он делится на 100, это не високосный,
     * за исключения тех годов которые делятся нацело на 400
     * 1992 - высокосный
     * 1900 - не высокосный
     * 2000 || 1600 || 1200 - высокосный
     */
    public static void main(String[] args) {
        int year = 2007;
        if (year % 4 == 0 && year%100!=0) {
            System.out.println(year+" - високосный год");
        } else if(year%400==0){
            System.out.println(year+" - високосный год");
        }else {
            System.out.println(year+" - не високосный год");
        }

//        if(year%400==0 ||(year%4==0 && year%100!=0)){
//            System.out.println(year+" - високосный год");
//        }else {
//            System.out.println(year+" - не високосный год");
//        }
    }
}
