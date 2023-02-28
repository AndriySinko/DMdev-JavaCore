package Day2;

public class Switch_5 {
    /**
     * switch - аналог if-else - только он уже принимает сам тип переменной, а не как в if else - true/false
     */
    public static void main(String[] args) {
        //Можно использовать только эти типы данных: byte, short, int, String, char enum
            int i =0;
            switch (i){
                case 0:
                    System.out.println("Переменная i=0");
                    break;
                case 1:
                    System.out.println("Переменная i<5");
                    break;
                case 2:
                    System.out.println("Переменная i<5");
                    break;
                case 3:
                    System.out.println("Переменная i<5");
                    break;
                case 4:
                    System.out.println("Переменная i<5");
                    break;
                case 5:
                    System.out.println("i = "+i);
                    break;
                case 6:
                    System.out.println("i = "+i);
                    break;
                case 7:
                    System.out.println("i = "+i);
                    break;
                case 8:
                    System.out.println("i = "+i);
                    break;
                case 9:
                    System.out.println("i = "+i);
                    break;
                case 10:
                    System.out.println("i = "+i);
                    break;
                default:
                    System.out.println("Переменная i>10");
        }
    }
}
