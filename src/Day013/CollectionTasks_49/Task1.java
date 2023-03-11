package Day013.CollectionTasks_49;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    /**
     * написать метод который принимает целочисленный список, и возвращает список только с нечетными значениями
     */
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            integerList.add(i);
        }
        System.out.println(integerList);
        System.out.println(deletePair(integerList));
    }

    public static List<Integer> deletePair(List<Integer> integers) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : integers) {
            if(value%2 != 0){
                result.add(value);
            }
        }
        return result;
    }
}
