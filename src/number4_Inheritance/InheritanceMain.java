package number4_Inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        ElectricCar auto = new ElectricCar("VAS","LadaSedan", 90, 2);
        System.out.println(auto);

        Auto auto1 = new Bus("Reno", "Bus", EngineType.PETROL, 100,200,0);
        Auto auto2 = new Truck("Kamaz", "Mega", EngineType.DIESEL, 300,300,0);

        auto1.start();
        auto2.start();
        System.out.println(auto1.isRunning());
        System.out.println(auto2.isRunning());
        System.out.println(auto2.isRunning());
    }

}
