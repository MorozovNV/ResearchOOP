package number2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Dog.dogsCounter);

        Dog dog1 = new Dog();
        dog1.setName("����");
        dog1.setSize(Size.�����);
        System.out.println("������: " + dog1.getName());
        System.out.println("������: " + dog1.getSize());
        System.out.print("���������� �����: ");
        dog1.bite();
        System.out.println();

        Dog dog2 = new Dog();
        dog2.setName("�����");
        dog2.setSize(Size.�������);
        System.out.println("������: " + dog2.getName());
        System.out.println("������: " + dog2.getSize());
        System.out.print("���������� �����: ");
        dog2.bite();
        System.out.println();

        Dog dog3 = new Dog();
        dog3.setName("�����");
        dog3.setSize(Size.��������);
        System.out.println("������: " + dog3.getName());
        System.out.println("������: " + dog3.getSize());
        System.out.print("���������� �����: ");
        dog3.bark();
        dog3.bite();

    }
}
