package number8_collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRunner {
    public static void main(String[] args) {
        String[] cars = {"Mini","Mercedes-Benz","Audi","VM", "Smart", "Toyota", "Porsche"};
        String[] otherCars = {"Audi", "Ford", "GMC", "Toyota", "Chevrolet"};

        Set<String> carSet = new HashSet<>(Arrays.asList(cars));

        Set<String> otherCarSet = new HashSet<>(Arrays.asList(otherCars));

        Set<String> uniqueCars = new HashSet<>(carSet);
        uniqueCars.addAll(otherCarSet);
        print(uniqueCars);

    }

    private static void print(Set<String> cars) {
        System.out.println(cars);
    }
}
