package Day6;

public class CompositionClasses_20 {
    /**
     * Композиция классво, это когда в одном классе, был созадн обьект дургого класса, и этот первый класс будет
     * использовать обьекты лургого класса, и он напрямую будет зависеть от него.
     */
    public static void main(String[] args) {
        Engine engine = new Engine(3.0,370);
        Transmission transmission = new Transmission("Auto",7);
        Car car = new Car(engine,transmission);
        car.info();
    }
}
class Car{
    private Engine engine;
    private Transmission transmission;

    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }
    void info(){
        System.out.println("Car:\n"+"Engine: "+"horsepower: "+engine.getHorsePower()+
                ", fuel: "+engine.getVolume()+ "\nTransmission: "+"transmission type: "
                    +transmission.getTransmissionType()+" speed: "+transmission.getTransmissionSpeed());
    }
}
class Engine{
    private double volume;
    private int horsePower;

    public Engine(double volume, int horsePower) {
        this.volume = volume;
        this.horsePower = horsePower;
    }

    public double getVolume() {
        return volume;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
class Transmission {
    private String transmissionType;
    private int transmissionSpeed;

    public Transmission(String transmissionType, int transmissionSpeed) {
        this.transmissionType = transmissionType;
        this.transmissionSpeed = transmissionSpeed;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public int getTransmissionSpeed() {
        return transmissionSpeed;
    }
}