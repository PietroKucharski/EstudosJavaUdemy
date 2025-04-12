package entities;

public class Employee02 {
    private final int id;
    private double salary;
    private String name;

    public Employee02(int id, String name, double salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void increaseSalary(double percent) {
        salary = salary + (salary  * percent) / 100.00;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + salary;
    }
}
