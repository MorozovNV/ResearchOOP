package number6_nested;

public class Main {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("Motorola", "XT1575");
        phone.turnOn();
        Display display = phone.getDisplay();
        Display.Pixel pixel = display.new Pixel(100,100, Display.Color.RED);
        Display.PixelStatic pixel1 = new Display.PixelStatic(1);

        //для урока про локальные и анонимные классы

        phone.call("1234567f90");

    }
}
