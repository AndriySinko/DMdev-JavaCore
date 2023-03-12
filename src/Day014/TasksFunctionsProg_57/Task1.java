package Day014.TasksFunctionsProg_57;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    /**
     * Дан список целых чисел. Найти среднее всех нечетных чисел делящихся на 5
     */
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(1,1000);
            integerList.add(x);
        }
        double d = integerList.stream()
                .filter(value -> value%2!=0)
                .filter(value -> value%5==0)
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println(d);
    }
}
