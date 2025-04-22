package entities;

public class Employee04 implements Comparable<Employee04>{
    private String name;
    private Double salary;

    public Employee04(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee04 other) {
        return salary.compareTo(other.getSalary()); // Se colocar um negativo atras de salary ele traz em decrescente
    }
}
