package Day011;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_42 {
    /**
     * Iterator - интерфейс с помощью которого мы можем итерироватся(проходить по всей колекции), с помощью методов
     * haxNext() next() будет проходится по ней. Перед использованием next() мы обязательно должны проверить если ли
     * следующий элемент с помощью haxNext()
     */
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);
        Iterator iterator = integerList.iterator();
        while (iterator.hasNext()){
            System.out.println(integerList);
            System.out.println("Следующий элемент: "+iterator.next());
            iterator.remove();

        }
        System.out.println(integerList);
    }
}