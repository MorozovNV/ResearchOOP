package number3.construcrors;

import number3.domainmodel.Employee;

import static java.lang.Math.*;

public class ConstructorsMain {
    public static void main(String[] args) {

        double sqrt = sqrt(4);

        Employee emp = new Employee("Nik","dev",200);
        System.out.println(emp.id);
        System.out.println(emp);
    }
}
