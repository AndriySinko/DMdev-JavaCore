package Day2;

public class SwitchAndVar_7 {
    /**
     * В джаве 12 чтобы упростить написание и читабельность switch кода, ввели возможность записывать его через
     * лямбда выраженния которые будут рассмотрены пожже.
     *
     * В 10 джаве было введено понятие как var - которому можно присвоить переменную любого типа, но в последствии
     * изменить типа переменной нельзя, но можно изменять значение.
     */
    public static void main(String[] args) {
        var typeInt = 5; //   == int typeInt = 5;
        // Целочисленные значения всегда по умолчанию = int
        // Чтобы присвоить целочисленное значение другого типа нужно: 1.Явно указать тип. 2.Использовать постфиксы

        var typeLong = 10L; // == long typeLong1 = 10;   **Присваивание типа long с помощью постфиксов
        var typeShort = (short) 20; // == short typeLong = 20;  **Присваивание типа short с помощью точного указания типа данных
        var typeByte = (byte) 1; // == byte typeByte = 1;

        var typeDouble = 15.2; // == double typeDouble = 15.2;
        //Числа с плавающей точкой всегда double;
        var typeFloat1 = 18.3F; // == float typeFloat1 18.3f;    **Постфикс
        var typeFloat2 = (float) 18.3; // == float typeFloat2 18.3f;  **Указание типа

        var typeChar1 = 'a'; // == char typeChar1 = 'a';
        var typeChar2 = '6';

        var typeString1 = "Hello"; // == String typeString1 = "Hello";

        /**
         * Тип var всегда должен быть инициалицирован
         *      - var value; - такой способ написания запрещен
         * Еще после инициализации var каким-то типом, потом изменить его нельзя.
         * Это то же самое что пытатся присвоить типу int значение "Hello"
         */


        switch (typeInt){
            case 1 -> System.out.println(typeInt+" Кейс 1");
            case 2,3,4,5 -> {
                System.out.println(typeInt+" Кейс 2,3,4,5");
                System.out.println("Вызвано в скобках");}
            default -> System.out.println(typeInt+" default");
        }
    }
}
