package Day014.TasksFunctionsProg_57;

import java.util.List;

public class Task2 {
    /**
     * Дан список строк, найти кол-во уникальных строк длиною больше 8
     */
    public static void main(String[] args) {
        List<String> stringList = List.of("12345","123","12345678","11","1234567890","111111111","987654321","12345");
        stringList.stream()
                .filter(value -> value.length()>8)
                .distinct()
                .forEach(System.out::println);
    }
}
