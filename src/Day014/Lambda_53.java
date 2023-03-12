package Day014;

import java.util.Comparator;

public class Lambda_53 {
    /**
     * Хоть джава являеется обьектно ориентированным языком, в версии Джава 8 произошло много изсенений, где добавилась
     * возможнось писать и в функциональном стиле.
     *
     * Все интерфесы у которых есть только 1 метод являюстя функцилнальными и обозначиваются @FunctionalInterface
     */
    // 1 способ инициализации функционального интерфейса
    public static class ComparatorExample implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1,o2);
        }
    }

    public static void main(String[] args) {
        Comparator comparator = new ComparatorExample();
        System.out.println(comparator.compare(5,10));


        //2 способ инициализации функционального интерфейса
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(comparator1.compare(5,10));


        //3 способ инициализации функционального интерфейса
        Comparator<Integer> comparator2 = (Integer o1, Integer o2) -> {
            return Integer.compare(o1,o2);
        };
        System.out.println(comparator2.compare(5,10));


        //4 способ инициализации функционального интерфейса
        Comparator<Integer> comparator3 = (o1,o2) -> {
            return Integer.compare(o1,o2);
        };
        System.out.println(comparator3.compare(5,10));


        //5 способ инициализации функционального интерфейса
        Comparator<Integer> comparator4 = (o1,o2) -> Integer.compare(o1,o2);
        System.out.println(comparator4.compare(5,10));


        //6 способ инициализации функционального интерфейса
        Comparator<Integer> comparator5 = Integer::compare;
        System.out.println(comparator5.compare(5,10));
    }
}
