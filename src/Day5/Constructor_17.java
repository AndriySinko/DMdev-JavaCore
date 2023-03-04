package Day5;

public class Constructor_17 {
    /**
     * При создании наших обьектов класса, обычно они создаются пустыми, без каких либо прараметоров(полей). Если
     * намнужно создать обьект класса, сразу с какими-то полями мы используем конструкторы.
     * Например на нужно созать обьект класса Человек с полями имя и возраст( так как у человека по умолчанию должно
     * быть имя и возраст) мы создадим конструктор с именем и возрастом по умолчанию.
     *
     * Так-же если нам не нужен человек с полями по умолчанию, можно создать конструктор где мы сами, зададим сколько
     * лет и какое имя у нашего обьекта.
     *
     * Еще есть такое понятие как перегрузка методов конструкторов, когда у конструктора есть одинаковое название,
     * но отличаюся заданые нами поля, и компилятор будет разделять какой это коструктор только, по указанными нами
     * полями.
     *
     * Чтобы задать наше имя, и связяать его с именем в констурктор используется ключевое слов this
     *
     * Так же в конгструкторах можно вызывать методы.
     */
    public static void main(String[] args) {
        Human human1 = new Human();

        Human human2 = new Human("Anton");
        human2.printInfo();

        Human human3 = new Human(20);
        human3.printInfo();

        Human human4 = new Human(17,"Andriy");

        //Перегрузка конструкторов наглядно показаны выше.
    }
}

class Human {
    int age = 0;
    String name = "Имя по умолчанию";

    public Human() {
        System.out.println("Конструктор 1: ");
        age = 0;
        name = "Имя по умолчанию";
        printInfo();
    }

    public Human(String name) {
        System.out.println("Конструктор 2: ");
        this.name = name;
    }

    public Human(int age){
        System.out.println("Конструктор 3: ");
        this.age = age;
    }

    public Human(int age, String name) {
        System.out.println("Конструктор 4: ");
        this.age = age;
        this.name = name;
        printInfo();
    }

    void printInfo() {
        System.out.println("Name: " + name + "\n" + "Age: " + age + "\n");

    }
}