package Day021;

import java.util.Arrays;
import java.util.concurrent.*;

public class CountDownLatch_84 {
    /**
     * CountDownLatch - это вспомогательный класс защелка, который не будет выполнятся до тех пор, пока не выполнятся все
     * условия(не уйдут защелки)
     */
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(PitStopDetail.values().length);
        ExecutorService pitStop = Executors.newFixedThreadPool(3);

        pitStop.submit(new PitStopCar(countDownLatch));

        Arrays.stream(PitStopDetail.values())
                .map(detail -> new PitStopRunnable(countDownLatch,detail))
                .forEach(pitStop::submit);

        pitStop.shutdown();
        pitStop.awaitTermination(5L, TimeUnit.MINUTES);
    }
}
enum PitStopDetail{
    WHEEL_1, WHEEL_2, WHEEL_3, WHEEL_4, FUEL_TANK
}

class PitStopCar implements Runnable{
    private final CountDownLatch countDownLatch;

    public PitStopCar(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Машина приехала, питсот начался");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Питсот закончился, машина уехала");
    }
}

class PitStopRunnable implements Runnable{
    private final CountDownLatch countDownLatch;
    private final PitStopDetail pitStopDetail;

    public PitStopRunnable(CountDownLatch countDownLatch, PitStopDetail pitStopDetail) {
        this.countDownLatch = countDownLatch;
        this.pitStopDetail = pitStopDetail;
    }

    @Override
    public void run() {
        if(pitStopDetail.name().equals("WHEEL_1") | pitStopDetail.name().equals("WHEEL_2") |
                pitStopDetail.name().equals("WHEEL_3") | pitStopDetail.name().equals("WHEEL_4")){
            System.out.println("Начинается замена колеса "+pitStopDetail+", это займет 1.5 секунды");
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            countDownLatch.countDown();
            System.out.println("Замена колеса "+pitStopDetail+" закончена");
        }else {
            System.out.println("Начинается заполнение топливного бака "+pitStopDetail+", это займет 2 секунды");
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            countDownLatch.countDown();
            System.out.println("Топливный бак заполнен");
        }

//        System.out.println("Начинается замена делтали "+pitStopDetail);
//        try {
//            Thread.sleep(1500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        countDownLatch.countDown();
//        System.out.println("Деталь "+pitStopDetail+" готова");
    }
}
