package Day014;

import java.util.Optional;
import java.util.stream.Stream;

public class Optional_56 {
    /**
     * Класс Optional появился в Java 8. Задачей этого класса является предоставление решений
     * на уровне типа-обертки для обеспечения удобства обработки возможных null-значений.
     * Используйте этот метод, когда есть вероятность, что упаковываемый объект может иметь null значение.
     */
    public static void main(String[] args) {
        Optional optional = Stream.of(
                new Student(15, "Anton", 5),
                new Student(18, "Mariya", 1),
                new Student(32, "Anastasia", 3),
                new Student(44, "Viktoria", 4),
                new Student(25, "Katya", 1),
                new Student(38, "Vitaliy", 2),
                new Student(17, "Andrii", 3),
                new Student(55, "Nikolay", 5)
        )
                .filter(student -> student.getCourse()>5)
                .filter(student -> student.getAge()<50 && student.getAge()>20)
                .reduce(((student, student2) -> student.getCourse()> student2.getCourse() ? student : student2));
        optional.ifPresent(System.out::println);
    }
}