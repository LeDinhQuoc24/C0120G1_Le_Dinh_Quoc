package Demo.Demo1;

public class Devices extends Product {
    private String description;

    public Devices() {
    }
    public Devices(int id, double price, String url) {
        super(id, price, url);
    }
    public Devices(int id, double price, String url, String description) {
        super(id, price, url);
        this.description = description;
    }
}
