package number2;

import java.sql.SQLOutput;

public class Dog {
    public static int dogsCounter = 0;

    private int paws = 4;
    private int tail = 1;
    private String name = "Неизвестный песик";
    private String breed = "Кто-ты, тварь";
    private String size = "Неизвестный размер";
    private String[] bazaSize = {"Шафка","Средний","Волкодав"};

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        for(int i=0;i<bazaSize.length; i++) {
            if (bazaSize[i].equalsIgnoreCase(size)) {
                this.size=size;
                return;
            }
        }
        System.out.println("Такой размер неприемлем ты че");
    }

    public Dog(){
        dogsCounter++;
        System.out.println("Еще одна псина в команде");
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
