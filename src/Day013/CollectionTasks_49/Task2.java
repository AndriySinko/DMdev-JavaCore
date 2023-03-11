package Day013.CollectionTasks_49;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    /**
     * Написать метод countUnique который принимает список целочисленных значений в качесвте параметра, а возвращает
     * колво уникальных обьектов. Если список пустой возвращает 0
     */
    public static void main(String[] args) {
        List<Integer> integers = List.of(5,6,3,2,5,1,10,5,10,6,4);
        System.out.println(countUnique(integers));
    }
    public static int countUnique(List<Integer> integerList){
        Set<Integer> integers = new HashSet<>();
        integers.addAll(integerList);
        return integers.size();
    }
}
