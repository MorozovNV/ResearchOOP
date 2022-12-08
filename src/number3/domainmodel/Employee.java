package number3.domainmodel;

public class Employee {

    public static int id;
    private int employeeId;
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position) {
        this (name, position, 300); // this должен быть на первом месте
        System.out.println("Constructor with 3 parameters called");
    }
    public Employee(String name, String position, int salary) {
        employeeId = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {'" + name + '\'' +
                ", '" + position + '\'' +
                ", " + salary +
                ", "+ employeeId + '}';
    }
}
