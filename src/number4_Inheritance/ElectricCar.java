package number4_Inheritance;

public class ElectricCar extends Auto{

    private int batteryVolume;
    private int passengersNumber;

    public ElectricCar(String producer, String model,
                       int batteryVolume, int passengersNumber) {
        super(producer, model, EngineType.ELECTRONIC);
        this.batteryVolume = batteryVolume;
        this.passengersNumber = passengersNumber;
    }

    public void charge() {
        System.out.println("Battery is charging");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "isRunning=" + isRunning +
                ", batteryVolume=" + batteryVolume +
                ", passengersNumber=" + passengersNumber +
                '}';
    }
}
