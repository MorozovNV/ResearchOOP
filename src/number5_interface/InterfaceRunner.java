package number5_interface;

public class InterfaceRunner {

    public static void main(String[] args) {
        Pricable pizza = new Pizza("Neapolitana", 1, 20, Size.L);
        Pricable phone = new CellPhone("Motorola", "XT1575", 1, 250);
        Pricable frige = new Frige("LG", "E9090", 1, 300);


        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(frige);
    }

    private static void printDeliveryPrice(Pricable del){
        System.out.println("Delivery prise " + del.calcDeliveryPrice());
    }
}
