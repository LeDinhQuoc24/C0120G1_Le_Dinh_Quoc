package Demo.Demo1;

public class Phone extends Product {
    private String camera;

    public Phone() {
    }

    public Phone(int id, double price, String url) {
        super(id, price, url);
    }
    public Phone(int id, double price, String url, String camera) {
        super(id, price, url);
        this.camera = camera;
    }
}
