package Day4;

import java.util.Arrays;

public class Array_13 {
    /**
     * Есои нам нужно работать с большим количесвтом данных, то создавать каждый рас новую переменную будет не хорошо.
     * Вместо этого создавется так сказать хранилище для этих данных массив.
     *
     * При создании массива данные которые в него входят можно инициализировать сразу.
     * Или можгл созлать массив с каким-то размером, и по ходу выполнения программы заполнить его.
     *
     * Выходить за рамки массива нельзя!!!
     *
     * У маасив есть индексы под которыми находятся данные.
     * Данные массива всегда можно изменить, указав индекс в котором будет происходить изменеие.
     */
    public static void main(String[] args) {
        int[] array = {5,7,10,4,8,9};
        System.out.println(Arrays.toString(array));
        array[0] = 1;
        array[2] = 0;
        array[4] = 5;
        System.out.println(Arrays.toString(array));
        System.out.println();

        int[] array2 = new int[10];
        System.out.println(Arrays.toString(array2));
        for(int i=0;i<array2.length;i++){
            if(i%2==0){
                array2[i]=i;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
