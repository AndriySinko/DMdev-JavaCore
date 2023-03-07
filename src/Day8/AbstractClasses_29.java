package Day8;

public class AbstractClasses_29 {
    /**
     * Абстрактные классы - это так сказать неполноценные классы которые невозможно создать. Их можно только
     * унаследовать с условием того что если этот класс имеет какие-то методы, то класс наследник должен их переопределитт
     * Но обычно абстрактные классы для этого не используется. Для определения методов в классе используются интерфейсы
     * про которые мы поговорим по позже.
     *
     * Абрстактные классы это шаблонные классы которые обыно используются чтобы описать поля класса наследника. Забегая
     * наперед интерфейсы не могут иметь поля, а только методы. То чтобы описать обьект с помощью методов то нам
     * потребуется куча методов чтобы это сделать. В случаем с абстрактными классами нам хватит создать только 1
     * метод который будет описывать иницаилзацию этих обьектов
     *
     * Если вы хотите чтобы от вашего класса уже никто не наследовался используйсте ключеваое слово final
     *
     * Также абстрактные классы могут иметь абстрактные методы которые классы наследники обязаны ициализировать
     */
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.getInfo();
        System.out.println();

        bmw.setModelAndYear();
        bmw.getInfo();
        System.out.println();

        Audi audi = new Audi();
        audi.setModelAndYear();
        audi.getInfo();
        System.out.println();

        audi.setModelAndYear("Audi Q5",2016);
        audi.getInfo();
    }
}
abstract class Car{
    private String model;

    private int year;
    public abstract void setModelAndYear(String model, int year);
    public abstract void setModelAndYear();
    public abstract void getInfo();
}
final class Bmw extends Car{
    public Bmw(){
    }
    private String model;
    private int year;
    @Override
    public void setModelAndYear(String model, int year) {
        this.year = year;
        this.model = model;
    }
    public void setModelAndYear() {
        this.model = "Модель по умолчания с метода";
        this.year = 1111;
    }

    @Override
    public void getInfo() {
        System.out.println("BMW : \nModel : "+model+"\nYear : "+year);
    }
}

final class Audi extends Car{
    public Audi(){
        super();
    }
    private String model;
    private int year;
    @Override
    public void setModelAndYear() {
        this.model = "Модель по умолчания с метода";
        this.year = 2222;
    }
    public void setModelAndYear(String model, int year) {
        this.year = year;
        this.model = model;
    }
    @Override
    public void getInfo() {
        System.out.println("Audi : \nModel : "+model+"\nYear : "+year);
    }
}