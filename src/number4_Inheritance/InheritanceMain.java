package number4_Inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        Car auto = new Car("VAS","LadaSedan",EngineType.DIESEL);
        System.out.println(auto.getProducer());
        System.out.println(auto.getModel());
    }

}
