package Demo.DemoXXX;

public class Employee extends Product{
    private double salary;
    private String address;

    public Employee() {
    }

    public Employee(double salary, String address) {
        this.salary = salary;
        this.address = address;
    }

    public Employee(int id, String name, double salary, String address) {
        super(id, name);
        this.salary = salary;
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void get() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void find() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
