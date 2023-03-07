package Day8;

public class Polymorphism_30 {
    /**
     * Полиморфизм позволяет нам создавать обьекты классов при наслседовании так, что ссылка будет ялвлятся Родителем
     * а наследник будет являтся обьектом
     */
    public static void main(String[] args) {
        Ssd ssd = new Ssd(512);
        Ram ram = new Ram(16);
        Processor processor = new Processor("Ryzen ",6900,16,8);
        Computer laptop = new Laptop("Asus ROG Stix G15",2022,ssd,ram,processor);
        laptop.load();
        laptop.getInfo("Asus ROG Stix G15",2022,ssd,ram,processor);
        laptop.off();

        Computer mobile = new Mobile();
        mobile.load();
        mobile.getInfo();
        mobile.off();
    }
}

abstract class Computer{
    private String name;
    private int year;
    private Ssd ssd;
    private Ram ram;
    private Processor processor;

    public Computer(String name, int year, Ssd ssd, Ram ram, Processor processor) {
        this.name = name;
        this.year = year;
        this.ssd = ssd;
        this.ram = ram;
        this.processor = processor;
    }
    public Computer(){
        this.name = "Имя по умолчанию";
        this.year = 0;
        this.ssd = new Ssd(0);
        this.ram = new Ram(0);
        this.processor = new Processor("Тип процессора по умолчанию",0,0,0);
    }
    abstract void load();
    void getInfo(){
        System.out.println("Computer: \nModel: "+name+"\nYear: "+year+"\nProcessor: "+processor+"\nSSD: "+ssd+"\nRAM: "+ram);
    }
    void getInfo(String name, int year, Ssd ssd, Ram ram, Processor processor){
        System.out.println("Computer: \nModel: "+name+"\nYear: "+year+"\nProcessor: "+processor+"\nSSD: "+ssd+"\nRAM: "+ram);
    }
    abstract void off();
}


final class Mobile extends Computer{
    public Mobile() {
        super();
    }

    @Override
    void load() {
        System.out.println("Я нажал на конпку и включился");
    }
    void off(){
        System.out.println("Телефон выключился\n");
    }
}


final class Laptop extends Computer{
    public Laptop(String name, int year, Ssd ssd, Ram ram, Processor processor){
        super(name,year,ssd,ram,processor);
    }
    @Override
    void load() {
        System.out.println("Я открыл крышку и загрузился");
    }
    void getInfo(String name, int year, Ssd ssd, Ram ram, Processor processor) {
        System.out.println("Laptop: \nModel: "+name+"\nYear: "+year+"\nProcessor: "+processor+"\nSSD: "+ssd+"\nRAM: "+ram);
    }
    @Override
    void off() {
        System.out.println("Ноутбук выключился\n");
    }
}



class Ssd{
    private int value;

    public Ssd(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nSSD Capacity : "+value;
    }
}
class Ram{
    private int  value;

    public Ram(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nRAM Capacity: "+value;
    }
}
class Processor{
    private String type;
    private int generation;
    private int flow;
    private int cores;

    public Processor(String type, int generation, int flow, int cores) {
        this.type = type;
        this.generation = generation;
        this.flow = flow;
        this.cores = cores;
    }

    public Processor(String type, int generation,int cores) {
        this.type = type;
        this.generation = generation;
        this.cores = cores;
    }

    @Override
    public String toString() {
        return  "\nProcessor type: "+type+"\nProcessor generation: "+ generation +
                "\nProcessor flows: "+ flow +"\nProcessor cores: "+ cores;
    }
}
