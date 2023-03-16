package Day017;

public class Thread_68 {
    /**
     * В джаве есть такое понятие как мнргопоточность, если коротко то это пользование нашей программы одновременно с
     * нескольких потоков. По умолчанию у нас есть только 1 потом - это main, но мы можем создавать новые
     *
     * .currentThread() - показывает текущий поток
     * .currentThread().gerName - показывает имя текузего потока
     *
     * .run() метод который не вызвает поток, а только говорит текущему потоку выполнить этот метод.
     * Чтобы вызвать новый поток нужно использовать .start()
     * .join() метод который заставляет ждать другие потоки, пока текущий поток не закончит работу
     */
    public static void main(String[] args) {
        System.out.println("Main start");
        NewThread newThread = new NewThread();
        newThread.start();
        try {
            newThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
        System.out.println();

        newThread.run();
        System.out.println("Main end");
    }
}
class NewThread extends Thread{
    public void run(){
        System.out.println("Поток 2 начал свое выполнение");
        System.out.println("Текущий поток: "+currentThread());
        System.out.println("Имя текущего потока " +getName());
        System.out.println();
    }
}