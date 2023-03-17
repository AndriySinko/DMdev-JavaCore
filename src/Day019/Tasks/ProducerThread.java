package Day019.Tasks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerThread extends Thread {
    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {

        synchronized (list) {
            while (true) {
                if (list.size() < 10) {
                    Random random = new Random(100);
                    int x = random.nextInt();
                    list.add(x);
                    System.out.println("Продюсер додает : " + x);
                    System.out.println("Размер листа " + list.size());
                } else {
                    System.out.println("Продюсер ничего не делает");
                }
                try {
                    System.out.println("Продюсер ждет");
                    list.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}