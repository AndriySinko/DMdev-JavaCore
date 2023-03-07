package Day9.Interfaces_32_33;

public class Test {
    /**
     * Кака я уже говорил в джаве сузествует аналог абстрактных классов, который предоставляет нам возможность
     * вызывать какие-то методы в других классах. Осуществляется это за щет ключевого слова implements.
     *
     * Интерфейсы в отличии от абстрактных классов не могут иметь полей, но могут иметь константы. Но в большим +
     * является то что 1 класс может имплементировать сколько угодно интерфейсов.
     *
     * Все методы в интерфейсах являюются абстрактными, то есть если класс имлеменирует какой-то интерфейс, он
     * так сказать укладывает контракт и обязательно должен реализовать все интерфейсы.
     *
     * Но с новой версией джавы 1 и 8 мы получили доступ делать интерфейсы default что позволяет нам реалтзовывать
     * тело метода сразу в интерфесе, и это будет работать точно так для всех классов.
     *
     * Также было добавлена возможность использования модификатора доступа private что позволяет скрыть нам какие-то
     * ненужные действия с данными, и ограничивает прямой доступ к константам.
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.info();
        for(int i=0;i<10000;i++){
            if (animal.getEnergy()==Test1.MIN_ENERGY){
                break;
            }else {
                animal.run();
            }
        }
        for(int i=0;i<10000;i++){
            if (animal.getEnergy()==Test1.MAX_ENERGY){
                break;
            }else {
                animal.eat();
            }        }
        animal.info();
        for(int i=0;i<10000;i++){
            if (animal.getEnergy()==Test1.MIN_ENERGY){
                break;
            }else {
                animal.run();
            }
        }
    }
}
class Animal implements Test1{
    private int energy=0;
    @Override
    public void eat() {
        if(energy<=MAX_ENERGY){
            System.out.println("Животное наелось");
            energy=100;
        }else {
            System.out.println("Животное голоное\nЖивотное ест");
            energy++;
        }
    }

    @Override
    public void sleep() {
        if(energy<=MAX_ENERGY){
            System.out.println("Полно сил, и нехочет спать");
            energy=100;
        }else {
            System.out.println("Животное устало\nЖивотное спит");
            energy++;
        }
    }

    @Override
    public void run() {
        if(energy<=MIN_ENERGY){
            System.out.println("Животное устало");
            energy=MIN_ENERGY;
        }else if (energy>=70 && energy<=MAX_ENERGY){
            System.out.println("Животное полно сил\nЖивотное бодрствует \n"+energy);
            energy--;
            energy++;
        } else if (energy<70 && energy>=50) {
            System.out.println("Животное начинает уставать\nЖивотное продолжает бодрствовать \n"+energy);
            energy--;
        } else if (energy<50 && energy>=25) {
            System.out.println("Животное скоро устанет\nЖивотное заканчивает бодрствовать\n"+energy);
            energy--;
        }else {
            System.out.println("Животное устало\nЖивотное закончило бодрствовать\n"+energy);
            energy = MIN_ENERGY;
        }
    }

    @Override
    public void info() {
        System.out.println(energy);
    }

    public int getEnergy() {
        return energy;
    }
}