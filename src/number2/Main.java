package number2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Dog.dogsCounter);

        Dog dog1 = new Dog();
        dog1.setName("Рекс");
        dog1.setSize("Шафка1");
        System.out.println(dog1.getSize());
        System.out.println(Dog.dogsCounter);

        Dog dog2 = new Dog();
        dog2.setName("Тузик");
        dog2.setSize("Средний");
        System.out.println(dog2.getSize());
        System.out.println(Dog.dogsCounter);

        Dog dog3 = new Dog();
        dog3.setName("Пушок");
        dog3.setSize("Волкодав");
        System.out.println(dog3.getSize());
        System.out.println(Dog.dogsCounter);
    }
}
