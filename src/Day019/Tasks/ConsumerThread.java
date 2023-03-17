package Day019.Tasks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ConsumerThread extends Thread {
    private Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removeVal = list.remove();
                    System.out.println("С листа удалено " + removeVal);
                    System.out.println("Размер листа " + list.size());
                }else {
                    System.out.println("Ожидание добавления, лсит пустой ");
                }
                try {

                    System.out.println("Ждем 500 мс");
                    list.notifyAll();
                    list.wait(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
