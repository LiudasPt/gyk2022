public class Employee extends Person{

    private int salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public double calculateSalary() {
        return salary * Math.random();
    }

}
