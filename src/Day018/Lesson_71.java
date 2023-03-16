package Day018;

public class Lesson_71 {
    /**
     * При многопопчности в идеале чтобы программа выполнялась с помощью атомарных операций(те что выполняются только 1 действием)
     * Если действий больше чем 1 то это уже составная
     *
     * Приведем пример в чем плохо использовать составные операции без их обпаботки
     *
     * В большинстве случаев потоки начнут работать одновременно и случится это:
     *
     * ---->8 -> 8+1 ----> 9
     *
     * ---->8 -> 8+1 ----> 9
     *
     * ---->8 -> 8+1 ----> 9
     *
     * после 3 итерцай у нас так и осталось число 9, а должно было быть 12
     *
     * чтобы такого не происходило используется ключевое слово synchronized
     */
    public static void main(String[] args) {
        Count count = new Count();
        CountThread countThread1 = new CountThread(count);
        CountThread countThread2 = new CountThread(count);
        CountThread countThread3 = new CountThread(count);
        CountThread countThread4 = new CountThread(count);
        CountThread countThread5 = new CountThread(count);
        CountThread countThread6 = new CountThread(count);
        CountThread countThread7 = new CountThread(count);
        CountThread countThread8 = new CountThread(count);
        CountThread countThread9 = new CountThread(count);
        CountThread countThread10 = new CountThread(count);

        countThread1.start();
        countThread2.start();
        countThread3.start();
        countThread4.start();
        countThread5.start();
        countThread6.start();
        countThread7.start();
        countThread8.start();
        countThread9.start();
        countThread10.start();

        try {
            countThread1.join();
            countThread2.join();
            countThread3.join();
            countThread4.join();
            countThread5.join();
            countThread6.join();
            countThread7.join();
            countThread8.join();
            countThread9.join();
            countThread10.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count.getCount());
    }
}
class Count{
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increment(){
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }

    public void decrement(){
        for (int i = 0; i < 1000; i++) {
            count--;
        }
    }
}

class CountThread extends Thread{
    private Count count;

    public CountThread(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        count.increment();
    }
}