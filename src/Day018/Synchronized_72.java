package Day018;

public class Synchronized_72 {
    /**
     *
     * В обьектов класса есть аткое понятие как монитор которое мы представим как boolean, если у этого монитора
     * стоит true то любой обьект может с ним воздействовать, если false то ни один.
     *
     * Ключевое слово synchronized отвечает за то что при вызове какого-то метода у обьекта класса у которго в мониторе
     * стоит true, то обьект класса который вызвет этот метод, переключит значение монитора на false и оно будет
     * таким оставатся до того момента пока обьект который вызвал метод не завершит свою работу.
     *
     * И это позволяет нам поочередно воздействовать с каким-то обьектом зная что другой обьект доступа к нему не
     * имеет.
     *
     * На 1 обьекте можно вызвать хоть сколько синхронищированых методов.
     *
     * Синхронизация может быть на уровне метода, или блок синхронизации
     *
     * Если с методом синхронайз все понятно, что будет вызыватся на те обьекты на которые мы вызовем этот метод
     * То с блоком синхронизации это будет работать так, что блок вывзова бкдет срабатывать только на те обьекты которые
     * мы укажем
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
class Count1{
    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void increment(){
            count++;
    }

    public void decrement(){
        count--;
    }
}

class CountThread1 extends Thread{
    private Count count;

    public CountThread1(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.increment();
        }
    }
}

class CountThread2 extends Thread{
    private Count count;

    public CountThread2(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.decrement();
        }
    }
}