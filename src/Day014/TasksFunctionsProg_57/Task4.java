package Day014.TasksFunctionsProg_57;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    /**
     * Дан список целых чисел, вывести строку представляющую конкатенацию строковых представлений этих чисел
     */
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        String result = integers.stream().map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result);
    }
}