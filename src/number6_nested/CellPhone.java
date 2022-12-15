package number6_nested;

public class CellPhone {

    private String make;
    private String model;
    private Display display;
    private RadioModele gsm;
    private AbstractPhoneButton button;

    public interface AbstractPhoneButton{
        void click();
    }

    public void initButton(){
        button = new AbstractPhoneButton() {//анонимный класс без имени потому что
            @Override
            public void click() {
                System.out.println("Button clicked");
            }
        };
    }

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn(){
        initDisplay();
        gsm = new RadioModele();
        initButton();
    }

    public void call(String number){
        button.click();
        gsm.call(number);
    }

    private void initDisplay(){
        display = new Display();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display getDisplay() {
        return display;
    }
}
