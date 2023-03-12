package Day014.TasksFunctionsProg_57;

import java.util.Map;

public class Task3 {
    /**
     * Дан Map<String,Integer>, найти сумму всех значений, длина ключей которых больше 7
     */
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "12345",7,
                "123",9,
                "1234567",10,
                "12345678",6,
                "1234",5,
                "87654321",10,
                "1111111111",1,
                "111",6
        );
        int sum = map.entrySet().stream()
                .filter(value->value.getKey().length()>7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
