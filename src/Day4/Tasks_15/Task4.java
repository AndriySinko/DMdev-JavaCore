package Day4.Tasks_15;

import java.util.Arrays;

public class Task4 {
    /**
     * Определить сумму элементов целочисленного массива, расположены между минимальными и максимальными значениями
     */
    public static void main(String[] args) {
        int[] array = {12, 453, 56, 23, 234, 85, 189, 345, 4, 9, 23};
        int x = max(array);
        int y = min(array,x);
        int z = sum(array,x,y);
        System.out.println(Arrays.toString(array));
        System.out.println("max : "+x+"\n"+"min : "+y+"\n"+"sum : "+z);
    }
    public static int max(int[] array){
        int max = 0;
        for (int i=0;i< array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array,int max){
        int min = max;
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static int sum(int[] array, int max, int min){
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=max && array[i]!=min){
                sum+=array[i];
            }
        }
        return sum;
    }
}