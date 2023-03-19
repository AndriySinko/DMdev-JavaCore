package Day021;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

public class Semaphore_86 {
    /**
     * Semaphore - вспомогательный класс который служит для ограничения каких-то блоков кода.
     * .acquire() - метод который захватывает монитор если он свободныц, если нет он ждет
     * .release() - метод который осободает монитор
     */
    public static void main(String[] args) {
    Semaphore cashboxes = new Semaphore(2);
    List<Thread> buyers = Stream.of(
                    new CashboxThread1(cashboxes),
                    new CashboxThread1(cashboxes),
                    new CashboxThread1(cashboxes),
                    new CashboxThread1(cashboxes),
                    new CashboxThread1(cashboxes),
                    new CashboxThread1(cashboxes),
                    new CashboxThread1(cashboxes),
                    new CashboxThread1(cashboxes),
                    new CashboxThread1(cashboxes),
                    new CashboxThread1(cashboxes)
            ).map(Thread::new)
            .peek(Thread::start)
            .toList();

        for (Thread buyer : buyers) {
        try {
            buyer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
}


class Cashbox1 {
    private static int count = 0;
    private int id;

    public Cashbox1() {
        this.id = count++;
    }

    @Override
    public String toString() {
        return "Cashbox{" +
                "id=" + id +
                '}';
    }
}


class CashboxThread1 implements Runnable {
    private final Semaphore cashboxes;

    public CashboxThread1(Semaphore cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            cashboxes.acquire();
            System.out.println(Thread.currentThread().getName() + " обслуживается на какой-то кассе");
            Thread.sleep(7L);
            System.out.println(Thread.currentThread().getName() + " освобождает какую-то кассу ");
            cashboxes.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
