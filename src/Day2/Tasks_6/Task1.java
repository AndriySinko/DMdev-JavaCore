package Day2.Tasks_6;

public class Task1 {
    /**
     * Дан порядковый номер месяца, вывести пору года, к которой относится месяц
     */
    public static void main(String[] args) {
        int value = 1;
        System.out.println("\nСейчас "+value+" по щету месяц");
        System.out.println("\nСпособ 1 - if-else:");

        if(value == 12 || value<=2){
            System.out.println(" Зима");
        } else if (value>=3 && value<=5) {
            System.out.println(" Весна");
        } else if (value>=6 && value<=8) {
            System.out.println(" Лето");
        }else if (value>=9 && value<=11){
            System.out.println(" Осень");
        }else {
            System.out.println(" В году только 12 месяцов");
        }

        System.out.println("\nСпособ 2 - switch:");
        switch (value){
            case 1:
                System.out.println(" Зима");
                break;
            case 2:
                System.out.println(" Зима");
                break;
            case 3:
                System.out.println(" Весна");
                break;
            case 4:
                System.out.println(" Весна");
                break;
            case 5:
                System.out.println(" Весна");
                break;
            case 6:
                System.out.println(" Лето");
                break;
            case 7:
                System.out.println(" Лето");
                break;
            case 8:
                System.out.println(" Лето");
                break;
            case 9:
                System.out.println(" Осень");
                break;
            case 10:
                System.out.println(" Осень");
                break;
            case 11:
                System.out.println(" Осень");
                break;
            case 12:
                System.out.println(" Зима");
                break;
            default:
                System.out.println(" В году только 12 месяцов");
        }

        System.out.println("\nСпособ 3 - switch:");
        switch (value){
            case 12:
            case 1:
            case 2:
                System.out.println(" Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето");
                break;
            case 9 :
            case 10:
            case 11:
                System.out.println(" Осень");
                break;
            default:
                System.out.println(" В году только 12 месяцов");
        }
    }
}
