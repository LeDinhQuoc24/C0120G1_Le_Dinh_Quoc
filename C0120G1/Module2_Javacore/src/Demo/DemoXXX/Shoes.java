package Demo.DemoXXX;

public class Shoes extends Product{
    private double size;
    private  String brand;

    public Shoes() {
    }

    public Shoes(double size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public Shoes(int id, String name, double size, String brand) {
        super(id, name);
        this.size = size;
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        return "Shoes{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                '}';
    }
}
