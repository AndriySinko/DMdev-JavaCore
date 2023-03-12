package Day014;

import java.util.stream.Stream;

public class ParallelStream_56 {
    /**
     * Паралельный стрим это тот самы стримЮ только он распределяет одну большую задачу, на подзадачи
     * и каждое ядро процессора выполняет свою, а в конце эти ядра сойдутся так сказать к одному, выполнится действие
     * между обработанными данными стромов и сами обрабтаются
     */
    public static void main(String[] args) {
        int ages = Stream.of(
                new Student(15,"Anton",5),
                new Student(18,"Mariya",1),
                new Student(32,"Anastasia",3),
                new Student(44,"Viktoria",4),
                new Student(25,"Katya",1),
                new Student(38,"Vitaliy",2),
                new Student(17,"Andrii",3),
                new Student(55,"Nikolay",5)
        )
                .parallel()
                .sorted((s1,s2)->s1.getCourse()- s2.getCourse())
                .filter(s1->s1.getAge()> 20)
                .skip(1)
                .limit(3)
                .peek(s1->System.out.println(s1.getName()))
                .mapToInt(Student::getAge)
                .reduce(Integer::sum).getAsInt();
        System.out.println(ages);

    }
}
class Student{
    private int age;
    private String name;
    private int course;

    public Student(int age, String name,int course) {
        this.age = age;
        this.name = name;
        this.course = course;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}