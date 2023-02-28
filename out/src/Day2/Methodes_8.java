package Day2;

public class Methodes_8 {
    /**
     * В джаве есть такое понятие как методы(функции) которые чтото выполняют.
     * Они состая с:
     *   модификатор, типа возвращеаемого значения, название(параметров){тело метода}
     *
     *  Модификатор говорит нам о том какая является функция (публичная или привтаная) модификаторы будут рассмотреты позже
     *  Тип возвращаемого значения - это наши типы данных которые метод нам возвращает после каких-то действий
     *      Также типа возвращаемого взначения может и не быть и пишется void
     *  Параметры - они бурет в себя какое-то значение с каким будет проводиться действия.
     *  Тело метода - что будет происходить с нашими данными
     */
    public static void main(String[] args) {
        int number1 = 2000;
        int number2 = 1500;

        System.out.println(isPrime(number2));
        System.out.println("max = "+max(number1,number2));
        System.out.println("min = "+min(number1,number2));
        method();
    }
    public static boolean isPrime(int year){
        if (year % 4 == 0 && year%100!=0) {
            return  true;
        } else if(year%400==0){
            return true;
        }else {
            return false;
        }
    }
    public static int max(int value1, int value2){
        if (value1>value2){
            return value1;
        }else {
            return value2;
        }
    }

    public static int min(int value1, int value2){
        if (value1<value2){
            return value1;
        }else {
            return value2;
        }
    }

    public static void method(){
        System.out.println("Вызов метода без возвращаемого значения");
    }
}
