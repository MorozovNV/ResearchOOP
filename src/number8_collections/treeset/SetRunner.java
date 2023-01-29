package number8_collections.treeset;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
       /* String[] europaCars = {"Mini","Mercedes-Benz","Audi","VM", "Smart", "Toyota", "Porsche"};
        String[] otherCars = {"Audi", "Ford", "GMC", "Toyota", "Chevrolet"};

        Set<String> carSet = new HashSet<>(Arrays.asList(europaCars));

        Set<String> otherCarSet = new HashSet<>(Arrays.asList(otherCars));

        Set<String> uniqueCars = new HashSet<>(carSet);
        uniqueCars.addAll(otherCarSet);
        print(uniqueCars);*/
        // Это для урокво по set

        Set<Car> sixCars = new HashSet<>();
        sixCars.add(new Car("VM", "Golf", 45));
        sixCars.add(new Car("VMa", "Golfa", 50));
        sixCars.add(new Car("VMb", "Golfb", 55));
        sixCars.add(new Car("VMc", "Golfc", 70));

        Set<Car> europaCars = new HashSet<>();
        europaCars.add(new Car("VM", "Golf", 45));
        europaCars.add(new Car("VM1", "Golf1", 50));
        europaCars.add(new Car("VM2", "Golf2", 55));
        europaCars.add(new Car("VM3", "Golf3", 60));

        NavigableSet<Car> uniqueCars = new TreeSet<>(sixCars);
        uniqueCars.addAll(europaCars);
        print(uniqueCars);
        System.out.println("____________________________________");
        //ветка до
        //SortedSet<Car> cars = uniqueCars.headSet(new Car("VM", "Golf1", 50));
        //print(cars);

        //ветка после
        //SortedSet<Car> cars = tailCars.headSet(new Car("VM", "Golf1", 50));

        //между
        SortedSet<Car> cars = uniqueCars.subSet(new Car("VM", "Golf1", 50), new Car("M", "G", 60));
        print(cars);
        System.out.println("____________________________________");

        //между включая последний - у меня не работает! он и так добавляет последнюю строку!
        SortedSet<Car> cars1 = uniqueCars.subSet(new Car("VM1", "Golf1", 50), true, new Car("VM3", "Golf3", 60), true);
        print(cars1);

    }

    private static void print(Set<Car   /*String*/> cars) {
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "Model", "Price per day");
        for (Car car : cars) {
            System.out.printf("%-20s %-20s %-20s \n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }
        System.out.println(cars);
    }


}

//С Новым годом! Пусть он будет лучше предыдущего.
// И пусть у всех у нас крепнут и прибавляются наши связи с другими людьми.
//