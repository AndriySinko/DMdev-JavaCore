package Day019.Tasks;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    /**
     * Задан LinkedList, представляющий собой хранилище целых чисел. Поток ProducerThread бесконечно добавляет в этот
     * список случайные числа, однако он не может добавить больше 10 чисел
     *
     * Поток ConsumerThread бесконечно считывает числа с этого листа с какой-то задержкой (от 0 до 10мс)
     *
     * Сделать так чтобы метод produce добавлял числа только тогда когда не превышен лимит, а метод consume забирал
     * их только тогда когда что нибуть есть
     *
     * Создать и запустить эти два потока и выводить когда элементы добавляются и удаляются, и размер листа
     */
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> list = new LinkedList<>();
        ProducerThread producerThread = new ProducerThread(list);
        ConsumerThread consumerThread = new ConsumerThread(list);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
