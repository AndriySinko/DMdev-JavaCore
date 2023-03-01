package Day3.Tasks_11;

public class Task2 {
    /**
     * Имеется число, пощитать суму всех цифр которые идут перед этим числом, вместе с самим числом
     */
    public static void main(String[] args) {
        int value = 100;
        sumVoidWhile(value);

        int i = sumIntFor(value);
        System.out.println("\nСумму всех чисел до "+value+" и в месте с ним = "+i);
    }
    static void sumVoidWhile(int i){
        int result = 0;
        int x=0;
        System.out.println("Задача выполняется с помощью цикла while, и ничего не возвращающего типа данных void");
        while(x<=i){
            result+=x;
            System.out.print(result+" ");
            x++;
        }
        System.out.println("\nСумму всех чисел до "+i+" и в месте с ним = "+result);
    }

    static int sumIntFor(int i){
        int result =0;
        System.out.println("\nЗадача выполняется с помощью цикла for, и возвращаемого типа данных int");
        for (int j = 0; j <= i; j++) {
            result+=j;
            System.out.print(result+" ");
        }
        return  result;
    }
}
