package number5_interface;

public class Frige extends Electronics implements Pricable{
    public Frige(String make, String model, int quantity, int price) {
        super(make, model, quantity, price);
    }

    @Override
    public int calcDeliveryPrice() {
        if(getPrice()>=300) {
            return 0;
        } else {
            return 25;
        }
    }
    @Override
    public int calcOrderPrice() {
        return getQuantity() * getPrice();
    }

}
