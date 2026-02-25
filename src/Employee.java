public abstract class Employee extends Person {

    protected double salary;

    public Employee(int id, String name, String phoneNumber, double salary) {
        super(id, name, phoneNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}