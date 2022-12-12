package number4_Inheritance;

public class Truck extends FuelAuto{

    private int cargoWeight;

    public Truck(String producer, String model, EngineType engineType,
                 int availablePetrol, int tankVolume, int cargoWeight) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Constructing truck");
    }

    public void load(){
        System.out.println("Cargo loaded");
    }

    public void unload() {
        System.out.println("Cargo unloaded");
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
