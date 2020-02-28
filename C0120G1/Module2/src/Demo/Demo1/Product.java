package Demo.Demo1;

public class Product {
    private int id;
    private double price;
    private String url;
    public Product() {
    }
    public Product(int id, double price, String url) {
        this.id = id;
        this.price = price;
        this.url = url;
    }
    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public String getUrl() {
        return url;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}
