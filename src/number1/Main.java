package number1;

public class Main {
    public static void main(String[] args) {
        new Cat();
        Cat.sound();
    }
}

class Cat {
    public Cat(){
    }
    public static void sound(){
        System.out.println("miy");
    }
}