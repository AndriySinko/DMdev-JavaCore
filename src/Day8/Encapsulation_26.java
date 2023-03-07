package Day8;

public class Encapsulation_26 {
    /**
     * Первый и один из основных принципов ООП это инкапсуляция.
     *
     * С помощью инкапсуляции мы скрываем наши поля классов, и огроничиваем к ним доступ обычному пользователю нашей
     * программы, так как ему это не нужно.
     * Осуществеляется это с помощью модификатор доступа private.
     * Мы позволяем пользователю пользоваться тем интерфейсом(действиями) которые мы ему предоставим. Это упрощит
     * пользование программой, а мы как рабоработчики всегда сможем изменить внутренюю часть програмы, без изменений
     * внешних возможностей.
     *
     * Чтобы предоставить доступ к какой-то пременной чтобы кто-то ее мог инициализировать и получить мы используем
     * setName()
     * getName()
     * Это тоже относится к инкапсуляции. Пользователь не имеет прямого доступа к переменным, но может воздействовать
     * с ними с помощью сеттеров и геттеров.
     */
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getAge()+" "+person.getName());
        person.info();
        System.out.println();

        person.setAge(15);
        person.setName("Anton");
        System.out.println(person.getAge()+" "+person.getName());
        person.info();
    }
}
class Person{
    private String name;
    private int age;

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
    public void info(){
        System.out.println("Name : "+name+"\nAge : "+age);
    }
}