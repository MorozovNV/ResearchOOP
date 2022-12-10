package number4_Inheritance;

public class Car extends Auto{

    public Car(String producer, String model, EngineType engineType) {
        super(producer, model, engineType);
        System.out.println("Car was initialized");
    }
}
