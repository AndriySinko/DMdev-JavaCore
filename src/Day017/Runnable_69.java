package Day017;

import java.util.Scanner;

public class Runnable_69 {
    /**
     * Многопоточность осуществляется за щет ядер на процессоре. Процесор или распределяет на каждое ядро по 1 потоку,
     * или выполняет все на 1 ядре, переключаясь между потоками, но это происходит так быстро что пояаляестя чуство
     * одновременности.
     * <p>
     * 2 способ создания потока с помощью имплементирования интерфейса Runnable который является функциональным, имеет
     * только 1 метод run. Пожтому создания потока происходить бкдет так:
     */
    public static void main(String[] args) {
        System.out.println("Main start");
        Thread runnable = new Thread(new NewRunnableThread());
        runnable.start();
        try {
            runnable.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Текущий поток: " + Thread.currentThread());
        System.out.println("Имя текущего потока: " + Thread.currentThread().getName());
        System.out.println("Main End");
    }
}

class NewRunnableThread implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("Созданный поток");
        System.out.println("Текущий поток: " + Thread.currentThread());
        System.out.println("Имя текущего потока: " + Thread.currentThread().getName());
    }
}