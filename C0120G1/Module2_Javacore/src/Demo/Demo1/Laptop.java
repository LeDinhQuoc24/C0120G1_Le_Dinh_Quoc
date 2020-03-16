package Demo.Demo1;

public class Laptop extends Product {
    private int ram;
    public Laptop() {
    }

    public Laptop(int id, double price, String url) {
        super(id, price, url);
    }

    public Laptop(int id, double price, String url, int ram) {
        super(id, price, url);
        this.ram = ram;
    }
}
