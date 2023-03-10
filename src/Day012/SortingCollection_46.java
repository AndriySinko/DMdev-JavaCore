package Day012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SortingCollection_46 {
    /**
     * Есл нам нужно остортировать коллекцию, мы должны это сделать через интерфейс Comparable или Comparator
     */
    public static void main(String[] args) {
        Person person1 = new Person(21,1,"Anton",2000);
        Person person2 = new Person(58,45,"Petr",1500);
        Person person3 = new Person(17,97,"Sveta",800);
        Person person4 = new Person(44,6,"Nikolay",3000);
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        for (Person p:personList) {
            System.out.println(p);
        }
        System.out.println();
        Collections.sort(personList);
        for (Person p:personList) {
            System.out.println(p);
        }
    }
}
class Person implements Comparable<Person>{
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
        return getAge() == person.getAge() && getId() == person.getId() && getSalary() == person.getSalary() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getId(), getName(), getSalary());
    }

    @Override
    public int compareTo(Person o) {
        return this.id-o.id;
    }
}