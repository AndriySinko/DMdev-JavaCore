package Day019;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Wait_Notify_NotifyAll_76 {
    /**
     * Эти методы определены у класса Object и предназначены для взаимодействия потоков между собой при межпоточной
     * синхронизации.
     *
     * • wait(): освобождает монитор и переводит вызывающий поток в состояние ожидания до тех пор, пока другой
     * поток не вызовет метод notify()/notifyAll();
     * • notify(): продолжает работу потока, у которого ранее был вызван метод wait();
     * • notifyAll(): возобновляет работу всех потоков, у которых ранее был вызван метод wait().
     *
     * Когда вызван метод wait(), поток освобождает блокировку на объекте и переходит из состояния Работающий (Running) в
     * состояние Ожидания (Waiting). Метод notify() подаёт сигнал одному из потоков, ожидающих на объекте, чтобы перейти
     * в состояние Работоспособный (Runnable). При этом невозможно определить, какой из ожидающих потоков должен стать
     * работоспособным. Метод notifyAll() заставляет все ожидающие потоки для объекта вернуться в состояние Работоспособный
     * (Runnable). Если ни один поток не находится в ожидании на методе wait(), то при вызове notify() или notifyAll()
     * ничего не происходит.
     *
     * Поток может вызвать методы wait() или notify() для определённого объекта, только если он в данный момент имеет
     * блокировку на этот объект. wait(), notify() и notifyAll() должны вызываться только из синхронизированного кода.
     */
    public static void main(String[] args) {
        Queue<Cashbox> cashboxes = new ArrayDeque<>(List.of(new Cashbox(), new Cashbox(),new Cashbox()));
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

class Cashbox{
    private static int count=0;
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


class CashboxThread implements Runnable{
    private final Queue<Cashbox> cashboxes;

    public CashboxThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            while (true){
                synchronized (cashboxes){
                    if(!cashboxes.isEmpty()){
                        Cashbox cashbox = cashboxes.remove();
                        System.out.println(Thread.currentThread().getName()+" обслуживается на кассе "+cashbox);

                        cashboxes.wait(10L);

                        System.out.println(Thread.currentThread().getName()+" освобождает кассу "+cashbox);
                        cashboxes.add(cashbox);
                        cashboxes.notifyAll();
                        System.out.println();
                        break;
                    }else {
                        System.out.println(Thread.currentThread().getName()+" ожидает свободную кассу ");
                        cashboxes.wait();
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}