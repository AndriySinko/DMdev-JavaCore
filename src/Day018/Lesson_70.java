package Day018;

public class Lesson_70 {
    /**
     * У потоков в джаве есть состояния. в зависимости от того работает наш поток ил создан, или закончился работать
     * состояния буду разные
     *
     * NEW - поток быд создан но не использован
     * RUNNABLE - поток выполняется
     * BLOCKED - в следствии чего-то поток заблокирован
     * WAITING - поток ждет пока выполнится работа чего-то другого
     * TIMED_WAITING - поток ждет пока закончится выполнение чего-то другого, или пока не пройдет определнное кол-во времни
     * TERMINATED - поток закончил свое выполнение.
     */
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread thread2 = new Thread(new Thread2());
        System.out.println(thread1.getName()+" "+thread1.getState());
        System.out.println(thread2.getName()+" "+thread2.getState());
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
        System.out.println();

        thread1.start();
        System.out.println(thread1.getName()+" "+thread1.getState());
        System.out.println(thread2.getName()+" "+thread2.getState());
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
        System.out.println();

        thread2.start();
        System.out.println(thread1.getName()+" "+thread1.getState());
        System.out.println(thread2.getName()+" "+thread2.getState());
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
        System.out.println();

        thread1.join();
        System.out.println(thread1.getName()+" "+thread1.getState());
        System.out.println(thread2.getName()+" "+thread2.getState());
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
        System.out.println();

        thread2.join(100);
        System.out.println(thread1.getName()+" "+thread1.getState());
        System.out.println(thread2.getName()+" "+thread2.getState());
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
        System.out.println();
    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
    }
}

class Thread2 implements Runnable{
    @Override
    public void run() {
    }
}