package number6_nested;

public class Display {

    private static final int DISPLAY_HEIGHT = 1920;
    private static final int DISPLAY_WIDTH = 1280;
    private int x = 0;

    public Display() {
        Pixel pixel = new Pixel(10, 10, Color.BLUE);
    }

    public class Pixel {

        private int x;
        private int y;
        private Color color;

        public /*должен быть приват вообще то*/Pixel(int x, int y, Color color) {

            if (0 <= x && x <= DISPLAY_HEIGHT && 0 <= y && y <= DISPLAY_WIDTH) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Creating " + color + " pixel at (" + x + ", " + y + ")");
            } else {
                throw new IllegalArgumentException("Coordinates x and y is not between 0-" + DISPLAY_HEIGHT + " and 0-" + DISPLAY_WIDTH);
            }
        }

        public void testScope(int x) {
            System.out.println(" x=" + x);
            System.out.println("this.x=" + this.x);
            System.out.println("Display.this.x=" + Display.this.x);
        }

    }

    public static class PixelStatic {
        private int x;

        public PixelStatic(int x) {
            this.x = x;
        }
    }

    public enum Color {
        RED, GREEN, BLUE, CYAN, MAGENTA, YELLOW, BLACK
    }

}
