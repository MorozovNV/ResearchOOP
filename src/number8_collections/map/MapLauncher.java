package number8_collections.map;

import number8_collections.treeset.Car;

import java.util.HashMap;
import java.util.Map;

public class MapLauncher {

    public static void main(String[] args) {
        //map - ������������� ������. ������ ���������� ����� ������ � ���������.
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1); //���� ������ ���� ����������, ����� ����������. ����� ����� ���� ������. ���� ��, �� ��� 1 � 1. ����� ����� � ������
        numbers.put("Two",2);
        numbers.put("Three", 3);

        System.out.println(numbers.get("Two"));
        Map<Car, Integer> carn = new HashMap<>();
        carn.put(new Car("Toyota", "Corolla", 50), 50);
        carn.put(new Car("Audi", "A5", 50), 51);

        //���� ������ ���� ������ � ���
        System.out.println(carn.get(new Car("Toyota", "Corolla", 50)));

    }
}
