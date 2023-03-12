package Day014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_54_55 {
    /**
     * Также в джаве 8 добавилиось такое понятие как Stream которое нам позволяет как-то работать, обрабатывать данные
     * коллекций(массивов).
     *
     * Stream преобразует нашу коллекцию(массив) в поток данных с которым мы что-то будем делать.
     * Методы Stream не меняют саму ранее созданную коллекцию.
     *
     * Есть такое поняти как промежуточные(Intermediate(lazy)) и конечные(Terminal) методы в stream
     * Intermadieate - методы которе мы вызываем и они возвращают нам stream
     * Terminal - конечные методы которе не возвращают нам ничего(void)
     *
     * Промежуточные методы невозможно вызвать если нету еонечного метода.
     *
     *
     * Кроме того стримы могут отличастся собой по типу потока, если у нас стрим обьектов, то он принимает
     * стим обьектов и также возвращает стрим обьектов(в каких-то случаях можно преобразовать в стрим примитивных типов
     * данных)
     * Стимы можна создать для примитивных типов, который принимает примитивный тип, и возвращает его, чтобы
     * преобразовывать можно использовать mapToInt(Double, Long, Float) или сразу создавать стим какого0то значения:
     * IntStream DoubleStream LongStream
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("10", "21", "34", "16", "25", "2", "4", "88", "93",
                "104", "73", "86", "55", "46"));
        //До выхода стримов
        Collections.sort(stringList);
        for (String s : stringList) {
            int i = Integer.parseInt(s);
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println();
        //После выхода стримов
        stringList.stream()
                .sorted()
                .map(Integer::parseInt)
                .filter(value -> value%2==0)
                .forEach(System.out::println);
        System.out.println();

        //Примитивные стримы
        List<String> stringList1 = new ArrayList<>(List.of("Hello","asda","Hel","asdaas","H","asdas","sdgdhdgh","asddasa"));
        List<Integer> integerList = stringList1.stream()
                .mapToInt(String::length)
                .sorted()
                .filter(integer -> integer%2==1)
                .peek(System.out::println)
                .boxed()
                .toList();

        System.out.println(integerList);
    }
}
