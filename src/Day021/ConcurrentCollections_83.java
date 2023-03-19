package Day021;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Stream;

public class ConcurrentCollections_83 {
    /**
     * Concurrent это коллекции для работы с многопоточностью, но отличаются от обычных коллекций обернутых для работы с
     * мнгп. тем что они являются потокобезопастные
     * <p>
     * ConcurrentHashMap - коллекция типа HashMap, реализующая интерфейс ConcurrentMap;
     * CopyOnWriteArrayList - коллекция типа ArrayList с алгоритмом CopyOnWrite;
     * CopyOnWriteArraySet - реализация интерфейса Set, использующая за основу CopyOnWriteArrayList;
     * ConcurrentNavigableMap - расширяет интерфейс NavigableMap;
     * ConcurrentSkipListMap - аналог коллекции TreeMap с сортировкой данных по ключу и с поддержкой многопоточности;
     * ConcurrentSkipListSet - реализация интерфейса Set, выполненная на основе класса ConcurrentSkipListMap.
     * <p>
     * CopyOnWriteArrayList - при чтении файлов не блокируется, но при добавлении она создает копию версии которая у нас есть
     * чтобы не разрушить структуру, а потом если все пройдет хорошо то она присвоит новое значение. Если в момент
     * добавления вызвать чтение, то данные будт считыватся с копии. По этому эта колекция обычно используется там
     * где есть много файлов на чтение.
     *
     *
     */
    public static void main(String[] args) {
        BlockingQueue<Cashbox> cashboxes = new ArrayBlockingQueue<>(3,false,List.of(new Cashbox(), new Cashbox()));
        List<Thread> buyers = Stream.of(
                        new CashboxThread(cashboxes),
                        new CashboxThread(cashboxes),
                        new CashboxThread(cashboxes),
                        new CashboxThread(cashboxes),
                        new CashboxThread(cashboxes),
                        new CashboxThread(cashboxes),
                        new CashboxThread(cashboxes),
                        new CashboxThread(cashboxes),
                        new CashboxThread(cashboxes),
                        new CashboxThread(cashboxes)
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

class Cashbox {
    private static int count = 0;
    private int id;

    public Cashbox() {
        this.id = count++;
    }

    @Override
    public String toString() {
        return "Cashbox{" +
                "id=" + id +
                '}';
    }
}


class CashboxThread implements Runnable {
    private final BlockingQueue<Cashbox> cashboxes;

    public CashboxThread(BlockingQueue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            Cashbox cashbox = cashboxes.take(); // .take() возвращает и удаляет элемент из очереди, если его там не оказалось он ожидает
            System.out.println(Thread.currentThread().getName() + " обслуживается на кассе " + cashbox);
            Thread.sleep(7L);
            System.out.println(Thread.currentThread().getName() + " освобождает кассу " + cashbox);
            cashboxes.add(cashbox);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

