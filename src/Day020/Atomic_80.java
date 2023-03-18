package Day020;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic_80 {
    /**
     * Начнем с того, что такое атомики и зачем нужны. Atomic* – семейство классов из java.util.concurrent.
     * Они предоставляют набор атомарных операций для соответствующих типов. Например с помощью методов
     * getAndIncrement/incrementAndGet класса AtomicInteger можно делать неатомарный в обычных условиях инкремент (i++).
     *
     * Условно можно разделить подходы реализации большинства atomic-методов на две группы: compare-and-set и set-and-get.
     *
     * Методы категории compare-and-set принимают старое значение и новое. Если переданное старое значение совпало с
     * текущим, устанавливается новое. Обычно делегируют вызов в методы класса Unsafe, которые заменяются нативными
     * реализациями виртуальной машины. Виртуальная машина в большинстве случаев использует атомарную операцию процессора
     * compare-and-swap (CAS). Поэтому атомики обычно более эффективны чем стандартная дорогостоящая блокировка.
     *
     * В случае set-and-get старое значение неизвестно. Поэтому нужен небольшой трюк: программа сначала считывает текущее
     * значение, а затем записывает новое, тоже с помощью CAS, потому что запись могла успеть поменяться даже за этот шаг.
     * Эта попытка чтения+записи повторяется в цикле, пока старое значение не совпадет и переменная не будет успешно записана.
     *
     * Этот трюк называется double-checked или optimistic locking, и может быть использован и в пользовательском коде
     * с любым способом синхронизации. Оптимистичность заключается в том, что мы надеемся что состояния гонки нет,
     * прибегая к синхронизации только если гонка всё же случилась. Реализация оптимистичной блокировки может быть
     * дана как отдельная задача.
     */
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(7);
        System.out.println(atomicInteger);

        atomicInteger.getAndIncrement();
        System.out.println(atomicInteger);

        atomicInteger.incrementAndGet();
        System.out.println(atomicInteger);

        atomicInteger.addAndGet(10);
        System.out.println(atomicInteger);

        int value = atomicInteger.decrementAndGet();
        System.out.println(value);
    }
}
