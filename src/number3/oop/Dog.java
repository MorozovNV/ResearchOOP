package number3.oop;

public class Dog {
    public static int dogsCounter = 0;

    private int paws = 4;
    private int tail = 1;
    private String name = "Неизвестный песик";
    private String breed = "Кто-ты, тварь";
    private Size size = Size.НЕИЗВЕСТНО;
    //private final String[] bazaSize = {"Шафка","Средний","Волкодав"};

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {

      this.size = size;

        /*for (String s : bazaSize) {
            if (s.equals(size)) {
                this.size = size;
                return;
            }
        }System.out.println("Такой размер неприемлем ты че");
    */
    }

    public Dog(){
        dogsCounter++;
        System.out.println("Еще одна псина в команде " + "(" + dogsCounter + ")");
    }

    public void bite(){
        if (dogsCounter>=3) System.out.println("Собаки вам устроили кусь-кусь");
        else bark();
    }

    public void bark(){
        switch (this.size){
            case ШАФКА -> System.out.println("тяф-тяф");
            case СРЕДНИЙ -> System.out.println("гав-гав");
            case ВОЛКОДАВ -> System.out.println("убью, сука");
            default -> System.out.println("Неразборчивый звук");
        }
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
