package Day018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson_73 {
    /**
     * Когда у нас есть коллекция и мы хотим с разных потоков чтото- с ней делать то у нас будет ошибка, так как несколько
     * потоков будут вызывать один и тот метод, мы можем выйти за пределы коллекции, или попытаемся на 1 и то самое место
     * вставить разные обьекты
     *
     * Чтобы от этого избавится нужно использовать синхронайх блок, или синхронизированые колекции, но это используется
     * только в крайних случаях. Обыяно для этого используюся специаольно на это разработаные concurrent колекции
     */
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        ListThread listThread1 = new ListThread(integers);
        ListThread listThread2 = new ListThread(integers);
        ListThread listThread3 = new ListThread(integers);
        ListThread listThread4 = new ListThread(integers);
        ListThread listThread5 = new ListThread(integers);

        listThread1.start();
        listThread2.start();
        listThread3.start();
        listThread4.start();
        listThread5.start();

        try {
            listThread1.join();
            listThread2.join();
            listThread3.join();
            listThread4.join();
            listThread5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(integers);



        List<Integer> integerList = Collections.synchronizedList(new ArrayList<>());
        ListThread listThread6 = new ListThread(integerList);
        ListThread listThread7 = new ListThread(integerList);
        ListThread listThread8 = new ListThread(integerList);
        ListThread listThread9 = new ListThread(integerList);
        ListThread listThread10 = new ListThread(integerList);

        listThread6.start();
        listThread7.start();
        listThread8.start();
        listThread9.start();
        listThread10.start();

        try {
            listThread6.join();
            listThread7.join();
            listThread8.join();
            listThread9.join();
            listThread10.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(integerList);
    }
}
class ListThread extends Thread{
    private List<Integer> list;
    public ListThread(List<Integer> list){
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list){
            for (int i = 0; i < 100; i++) {
                list.add(i);
            }
        }
    }
}