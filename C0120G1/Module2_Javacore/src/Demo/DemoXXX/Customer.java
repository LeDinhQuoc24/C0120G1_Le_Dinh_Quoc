package Demo.DemoXXX;

public class Customer extends Product{
    private String address;
    private int age;

    public Customer() {
    }

    public Customer(String address, int age) {
        this.address = address;
        this.age = age;
    }

    public Customer(int id, String name, String address, int age) {
        super(id, name);
        this.address = address;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer(int id, String name) {
        super(id, name);
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
        return "Customer{" +
                "address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
