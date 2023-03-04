package Day5;

public class Lesson_18 {
    /**
     * Как и перегрузка конструкторов, так же и существует перегрузка методов, правила те самые,
     * сигнатура метода(имя и параметры) должна отличатся только параметрами.
     */
    public static void main(String[] args) {
        Car car = new Car(0,"Машина по умолчанию");
        car.getInfo();
        car.getInfo(2016);
        car.getInfo("Mercedes-Benz GLE");
        car.getInfo(2022,"Porsche 911");
    }
}

class Car{
    int year;
    String model;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }
    void getInfo(){
        System.out.println("Методы 1: \n"+model+"\n"+year);
        System.out.println();
    }
    void getInfo(int year){
        System.out.println("Методы 2: \n"+model+"\n"+year);
        System.out.println();
    }
    void getInfo(String model){
        System.out.println("Методы 3: \n"+model+"\n"+year);
        System.out.println();
    }
    void getInfo(int year,String model){
        System.out.println("Методы 4: \n"+model+"\n"+year);
        System.out.println();
    }
}
