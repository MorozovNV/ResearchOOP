package number5_interface;

public class CellPhone extends Electronics implements Deliverable {
    public CellPhone(String make, String model, int quantity, int price) {
        super(make, model, quantity, price);
    }

    @Override
    public int calcDeliveryPrice() {
        if(getPrice()>=150) {
            return 0;
        } else {
            return 10;
        }
    }

    @Override
    public int calcOrderPrice() {
        return getQuantity() * getPrice();
    }


}
