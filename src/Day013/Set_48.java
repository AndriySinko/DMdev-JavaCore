package Day013;

import java.util.*;

public class Set_48 {
    /**
     * Коллекция Set основана на совное Map, в качесвте ключа она принимает заданое нами значение а в качесвте самого
     * значения там стоит зауглушка.
     * Так как в основе Set лежит Map так само и HashSet лежит HashMap,  LinkedHashSet - LinkedHashMap, TreeSet - TreeMap.
     *
     * HashSet незапоминает порядок добавления.
     * LinkedHashSet запоминает.
     * TreeSet используется тогда когда нужно отсортировать коллекцию.
     *
     * Метод add возвращает значение boolean.
     *
     */
    public static void main(String[] args) {
        Person person1 = new Person(21,1,"Anton",2000);
        Person person2 = new Person(58,45,"Petr",1500);
        Person person3 = new Person(17,97,"Sveta",800);
        Person person4 = new Person(44,6,"Nikolay",3000);
        Set<Person> people1 = new HashSet<>();
        people1.add(person2);
        people1.add(person4);
        people1.add(person3);
        people1.add(person1);
        for (Person person : people1) {
            System.out.println(person);
        }
        System.out.println();
        Set<Person> people2 = new LinkedHashSet<>();
        people2.add(person2);
        people2.add(person4);
        people2.add(person3);
        people2.add(person1);
        for (Person person : people2) {
            System.out.println(person);
        }
        System.out.println();
        Set<Person> people3 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId()-o2.getId();
            }
        });
        people3.add(person2);
        people3.add(person4);
        people3.add(person3);
        people3.add(person1);
        for (Person person : people3) {
            System.out.println(person);
        }
    }
}
class Person{
    private int age;
    private int id;
    private String name;
    private int salary;

    public Person(int age, int id, String name, int salary) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getId() == person.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
