package Day021;

import java.util.Arrays;
import java.util.concurrent.*;

public class CyclicBarrier_85 {
    /**
     * CyclicBarrier очнь похож на CountDownLatch, только они отлтчаются тем что, CountDownLatch(5) с переданым в
     * конструктор числом 5, с помощью метода .await() будет ждать до тех пор пока не вызвоется .countDown(), столько
     * раз, чтобы уменьшить число в конструкторе до 0, (метод .countDown() делает декремент заданого в параметры числа)
     *
     * А CyclicBarrier(5) будет ждать до тех пор пока не вызовется метод .await() столько раз, в зависимости од того
     * какое мы число задли в параметры.
     */
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(RocketDetail.values().length, () -> System.out.println("Пуск!!!"));
        ExecutorService executorService = Executors.newCachedThreadPool();

        Arrays.stream(RocketDetail.values())
                .map(detail-> new RocketDetailRunnable(cyclicBarrier,detail))
                .forEach(executorService::submit);

        executorService.shutdown();
        executorService.awaitTermination(1L,TimeUnit.SECONDS);
    }
}
enum RocketDetail{
    ENGINE_1, ENGINE_2, ENGINE_3, FUEL_TANK, ACCELERATOR
}

class RocketDetailRunnable implements Runnable{
    private final CyclicBarrier cyclicBarrier;
    private final RocketDetail rocketDetail;

    public RocketDetailRunnable(CyclicBarrier cyclicBarrier, RocketDetail rocketDetail) {
        this.cyclicBarrier = cyclicBarrier;
        this.rocketDetail = rocketDetail;
    }

    @Override
    public void run() {
        if(rocketDetail.name().equals("ENGINE_1") | rocketDetail.name().equals("ENGINE_2") |
                rocketDetail.name().equals("ENGINE_3") | rocketDetail.name().equals("ACCELERATOR")){
            System.out.println("Начинается изготовление "+rocketDetail+", это займет 1.5 секунды");
            try {
                Thread.sleep(1500L);
                System.out.println(rocketDetail+" готов, ждет установки");
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }

            System.out.println(rocketDetail+" установлен");
        }else {
            System.out.println("Начинается заполнение топливного бака "+rocketDetail+", это займет 2 секунды");
            try {
                Thread.sleep(2000L);
                System.out.println("Топливный бак заполнен, ждет запуска");
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

