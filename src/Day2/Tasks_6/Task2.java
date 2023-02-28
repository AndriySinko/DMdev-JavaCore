package Day2.Tasks_6;

public class Task2 {
    /**
     * Имеется целое число, проверить является ли последняя цифра этого числа - цифрой 3
     */
    public static void main(String[] args) {
        int value = 3;
        if(value%10==3){
            System.out.println("Последняя цифра - 3");
        }else {
            System.out.println("Последнее число не является цифрой 3");
        }
    }
}
