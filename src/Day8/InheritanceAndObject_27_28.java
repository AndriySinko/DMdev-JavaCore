package Day8;

public class InheritanceAndObject_27_28 {
    /**
     * Наследование - 2 базовый прицип ООП который позволяет одним классам наследовать дургие, и дает возможность
     * пользоватся функционалом класса родителя, но у класса родителя нету доступа к функционалу насоелника.
     *
     * Класс может наследовать только 1 какой-то другой класс. Но наследоватся от класса родителя может сколько
     * угодно классов.
     *
     * При переопределении методов класса родителя в другом классу и вызова их в main то вызовется метод именно класса
     * наследника, но если его не переопределить то вызовается значение которое было определено в классе родителе.
     *
     * Если у класса родителя есть какой-то конструктор то классу нуаследнику обязательно нужно его повторить в своеме
     * теле с помощью ключевого слова super
     *
     *
     *
     * Так-же в джаве есть класс Object от которого унаследуются абсолютно все классы джава, поэтому когда
     * у нас нету своих созданных методов, то если попытатся через точку вызвать метод, то нам покажет все методы
     * которые реализованы в классе Object. Если переопределить методы класса Object в каком-то классе, то
     * все обьекты этого класса при вызове этого метода, будут вызивать уже переопределнный метод. Но если
     * он не переопределен, то на все обьекты будут вызиватся методы которые реализованы в Object
     *
     * В нашем случае иерархия классов является такой:
     *
     * Object -> Animal -> Dog
     *
     * Где Object это класс родитель по умолчанию для всех, и его методы доступы всем его наследникам
     *
     * Animal являеется наследником класса Object и родителем Dog, ему доступны только его созданные методы, и методы
     * класса Object
     *
     * Dog является наследником класса Animal, в то время как Animal наследует Object, поэтому есму доступны его
     * собственные методы, методы класса Animal и методы класса Object.
     *
     * Инициаоизация обьектов в джаве происходит сначала от класса наследника ло класса Object, инициализируются
     * методы класса Object, потом инициализируется Animal и только потом Dog
     */
    public static void main(String[] args) {
        Animal animal = new Animal(5,"Elephant",8);
        animal.eat();
        animal.sleep();
        animal.info();
        System.out.println();

        animal.setAge(10);
        animal.setId(15);
        animal.setName("Cat");
        System.out.println(animal.getName()+"\n"+animal.getAge()+"\n"+animal.getId());
        System.out.println();

        Dog dog = new Dog(27,"Bulldog",5,10);
        dog.sleep();// переопределнный метод eat
        dog.eat();// переопределннный метод sleep
        dog.bark(); // новый метод у класса Dog
        dog.info(); // метод инфо у класса не переопределен, поэтому выводится метод инфо который реализован в классе родителе
        System.out.println();

        dog.setAge(11);
        dog.setName("Pug");
        dog.setId(32);
        dog.setWeight(15);
        System.out.println("Геттеры унаследованые от класса родителя\n"+dog.getName()+"\n"+dog.getAge()+"\n"+dog.getId()+
                "\nНовый геттер : \n"+dog.getWeight());
    }
}


class Animal{
    private int id;
    private String name;
    private int age;

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void info(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nID : "+id);
    }
    public void eat(){
        System.out.println("Animal is eating...");
    }
    public void sleep(){
        System.out.println("Animal i sleeping...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Dog extends Animal{
    private int weight;
    public Dog(int id, String name, int age, int weight) {
        super(id, name, age);
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
    public void bark(){
        System.out.println("Dog is barking...");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
