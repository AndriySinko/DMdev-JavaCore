package Day011;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_40 {
    /**
     * Аррайлист это класс который имплементирует интерфейс лист. Основывается он на базе масивов, но если у масива
     * мы должны указывать размер и выходить за пределы нельзя, то в аррайлистах это будет работать таким образом
     * что если заполнить полностью аррайлист и попытатся добавить новый элемент, то произойдет создание нового аррайлиста
     * в который скопируется старый, и добавится еще 2 места, тоесть если у нас был массив размером 5 то он станет 7
     *
     * У аррайлиста есть понятие capacity и size, capacity это размер массива(аррайлиста) size это его заполненость
     * В нашем случае когда массив был заполнен 5 элементами, его capacity и size = 5, но когда мы добавили 6 элемент
     * его capacity стало 7 а size 6
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(5);
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("Hello");
        System.out.println(stringList);
        stringList.add("Hello"); // создание нового листа, в который скопировался старый, и добавился еще 1 элемент
        System.out.println(stringList);
        System.out.println(stringList.size());
    }
}
