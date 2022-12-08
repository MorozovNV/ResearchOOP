package number3.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println(Dog.dogsCounter);

        Dog dog1 = new Dog();
        dog1.setName("Рекс");
        dog1.setSize(Size.ШАФКА);
        System.out.println("Кличка: " + dog1.getName());
        System.out.println("Размер: " + dog1.getSize());
        System.out.print("Издаваемые звуки: ");
        dog1.bite();
        System.out.println();

        Dog dog2 = new Dog();
        dog2.setName("Тузик");
        dog2.setSize(Size.СРЕДНИЙ);
        System.out.println("Кличка: " + dog2.getName());
        System.out.println("Размер: " + dog2.getSize());
        System.out.print("Издаваемые звуки: ");
        dog2.bite();
        System.out.println();

        Dog dog3 = new Dog();
        dog3.setName("Пушок");
        dog3.setSize(Size.ВОЛКОДАВ);
        System.out.println("Кличка: " + dog3.getName());
        System.out.println("Размер: " + dog3.getSize());
        System.out.print("Издаваемые звуки: ");
        dog3.bark();
        dog3.bite();

        Size s = Size.ЩЕНЯРА;
        System.out.println(s.toString()); //sout и так вызывет ту стринг, это не обьязательно
        Size s1 = Size.valueOf("ЩЕНЯРА");
        System.out.println(s1);

        Size[] values = Size.values();
        for (int i=0; i< values.length;i++){
            System.out.println(values[i]);
        }

    }
}
