package Day020;

import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.*;

public class ThreadPool_82 {
    /**
     * ThreadPool - это как коллекция которая содержит в себе потоки.
     * Работает она по принципу который показан внизу
     * он принимает на вход задачи, поток захватывает какую-то задачу, выполняет ее и удаляет, очень быстро освобождает монитор
     * и переходит к выполнению другой задачи. Есл задач нет то потоки ждут
     */
    class TestThreadPool extends Thread{
        private Queue<Runnable> tasks;
        public TestThreadPool(Queue<Runnable> tasks) {
            this.tasks = tasks;
        }

        @Override
        public void run() {
            while (true){
                Optional<Runnable> task = Optional.empty();
                synchronized (tasks){
                    if(!tasks.isEmpty()){
                        task = Optional.of(tasks.remove());
                    }
                }
                task.ifPresent(Runnable::run);
            }
        }
    }

    /**
     * В джаве по умолчантю существуют пулы, подобные на тот который мы сейчас создали. Создаются они с помощью утилитного
     * класса Executors
     *
     * 1.Executors.newSingleThreadExecutor() - тот который мы сейчас создали, создает один поток который выполняет задачи
     * 2.Executors.newFixedThreadPool(5) - создает фиксированое кол-0во потоков которое мы указали, и жто кол-во потоков
     * будет выполнять наши задачи
     * 3.Executors.newCashedThreadPool - создает неограниченое кол-во потоков, взависимисти от кол-ва задач
     * Если мы передали 5 задач, создастся 5 потоков, которые будут выполнять эти задачи. Эти потоки сохраняются
     * поэтому если мы потом еще раз передадим например 3 задачи, то новые потоки не создадутся, а будут использованы
     * те 3 из 5 которые мы создали перед этим. Если у нас сохранено 5 потоков, а мы передаем 7, то пул авоматически
     * создаст еще 2.
     *
     * Принимать они в себя могут обьекты Runnable и Called. Called это те же самые Runnable только возвращают результат
     * Future - это реультат который мы получим в будущем, после этого наш поток main продолжает свое выполнение.
     * .get() заставляет main остановится и ждать до тех пор пока поток не возвратит результат
     *
     * Потоки обязательно нужно закрывать с помощью
     * .shutdown() - main ждет конца выполнения потока
     * .awaitTermination(5L,TimeUnit.MINUTES ); - main ждет конца выполнения или пока пройдет какое-то кол-во времени
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        System.out.println("main start");
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        Future<Integer> future = threadPool.submit(() -> {
            System.out.println("task 1 start");
            int result = 0;
            for (int i = 0; i <= 10; i++) {
                System.out.print(i+" ");
                Thread.sleep(600L);
                result=i;
            }
            System.out.println("task2 end");
            return result;
        });

        System.out.println("Result 1 : "+future.get());

        Future<String> future1 = threadPool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("task2 start");
                StringBuilder stringBuilder = new StringBuilder("0");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(stringBuilder);
                    stringBuilder.append(i);
                    Thread.sleep(400);
                }
                System.out.println("task2 end");
                return String.valueOf(stringBuilder);
            }
        });
        try {
            System.out.println("Result 2 : "+future1.get(2L,TimeUnit.SECONDS));
        } catch (TimeoutException e) {
            System.out.println("Время вышло");

        }
        threadPool.shutdownNow();
        System.out.println("main end");


    }
}