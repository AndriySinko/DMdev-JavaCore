package Day7;

public class Static_23 {
    /**
     * Статические переменные это переменные которые относятся ко всем обьекта класса, вне зависимости от параметров
     * обьекта. Если статическая переменная у класса равняется 0, у всех обьектов этого класса, эта переменна тоже
     * будет равняться 0, если изменить на 5, у всех обьектов она тоже изменится на 5
     */
    public static void main(String[] args) {
        System.out.println(Test.getCounterObject());

        Test test1 = new Test();
        System.out.println(Test.getCounterObject());

        Test test2 = new Test();
        System.out.println(Test.getCounterObject());

        Test test3 = new Test();
        System.out.println(Test.getCounterObject());
        System.out.println(Test.getString());
        System.out.println();

        Test.setString("Измененная перменная статик");
        System.out.println(test1.getString());
        System.out.println(test2.getString());
        System.out.println(test3.getString());

        System.out.println(test1.getCounterObject());
        System.out.println(test2.getCounterObject());
        System.out.println(test3.getCounterObject());
    }
}
class Test{
    private static int counterObject;
    private static String string = "Статик по умолчанию";
    public Test(){
        counterObject++;
    }

    public static int getCounterObject() {
        return counterObject;
    }

    public static String getString() {
        return string;
    }

    public static void setString(String string) {
        Test.string = string;
    }
}