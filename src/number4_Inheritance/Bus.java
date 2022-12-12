package number4_Inheritance;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, EngineType engineType,
               int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }
//overloading
    public void fuelUp(){
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }
//overriding
    @Override
    public void fuelUp(int petrolVolume) {
         int volume = getAvailablePetrol() + petrolVolume;
         if (volume>getTankVolume()) {
             setAvailablePetrol(getTankVolume());
         }
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassangers(int passengerNumber) {
        this.passengerNumber+=passengerNumber;
        System.out.println("Picking up " + passengerNumber + " passangers");
    }

    public void releasePassengers(){
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released");
    }
}
