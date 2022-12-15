package number5_interface;

public interface Pricable extends Deliverable, Orderable{

    default int calcPrice(){
        return calcOrderPrice() + calcDeliveryPrice();
    }

    static void doSmth(){

    }

}
