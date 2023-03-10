package Day011;

import java.util.Objects;

public class EqualsAndHashCode_43 {
    /**
     * Метод equals() - это метод который сравнивает какие-то данные, в зависимости от типа данных(если примитивный то
     * сравнивает сами данные, если ссылочные то сравнивает ссылки)
     * hashCode() - метод который на основе наших данных, генерирует им специальный уникальний(не всегда код)
     *
     * При equals должны соблюдатся:
     * - Рефлексивность - x.equals(x) = true
     * - Симметричность - x.equals(y) == y.equals(x)
     * - Транизитивность if(x.equals(z) == y.equals(z)) - {x==y}
     * - Повторяемость - внезависимости от к-лва вызова метода equals() на одни и тех элементах результат должен быть одинаковым
     *
     * При hashCode должны соблюдатся:
     * - Хэшкод одинаковых элементов должен быть одинаковым
     * - У двух разных элементов МОГУТ БЫТЬ РАЗНЫЕ hashCode
     */
    public static void main(String[] args) {
        Person person = new Person(5,"Anton",15);
        Person person1 = new Person(5,"Anton",15);
        Person person2 = person;
        Person person3 = new Person(8,"Andrii",16);
        System.out.println(person.hashCode()+"\n"+person1.hashCode()+"\n"+
                person2.hashCode()+"\n"+person3.hashCode());
        System.out.println("person.equals(person1) = "+person.equals(person1));
        System.out.println("person.equals(person2) = "+person.equals(person2));
        System.out.println("person1.equals(person2) = "+person1.equals(person2));
        System.out.println();
        System.out.println("person.equals(person3) = "+person.equals(person3));
        System.out.println("person1.equals(person3) = "+person1.equals(person3));
        System.out.println("person2.equals(person3) = "+person2.equals(person3));
    }
}
class Person{
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return id == person.id && age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}