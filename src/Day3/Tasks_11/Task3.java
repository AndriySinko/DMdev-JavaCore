package Day3.Tasks_11;

public class Task3 {
    /**
     * В каком-то году году индейцы продали Манхэттен за какое-то. Написать программу которая выщитывает сколько денег сейчас бы
     * имели индейцы в текущем году, если в 1626 они полижили эти деньги в банк по 5% годовых.
     */
    public static void main(String[] args) {
        int year = 2000;
        double money = 1000;
        aVoid(money,year);
    }
    static void aVoid(double money, int year){
        for(int i=year+1;i<=2023;i++){
            money+=money/20;
            System.out.println(i+" : "+money);
        }
        System.out.println(money);
    }
}
