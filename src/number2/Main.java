package number2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Dog.dogsCounter);

        Dog dog1 = new Dog();
        dog1.setName("Рекс");
        dog1.setSize("Шафка");
        System.out.println(dog1.getName());
        System.out.println(dog1.getSize());
        dog1.bark();
        System.out.println();

        Dog dog2 = new Dog();
        dog2.setName("Тузик");
        dog2.setSize("Средний");
        System.out.println(dog2.getName());
        System.out.println(dog2.getSize());
        dog2.bark();
        System.out.println();

        Dog dog3 = new Dog();
        dog3.setName("Пушок");
        dog3.setSize("Волкодав");
        System.out.println(dog3.getName());
        System.out.println(dog3.getSize());
        dog3.bark();

    }
}
