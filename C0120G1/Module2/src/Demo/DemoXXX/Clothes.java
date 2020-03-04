package Demo.DemoXXX;

public class Clothes extends Product{
    private double size;
    private String color;

    public Clothes() {
    }
    public Clothes(double size, String color) {
        this.size = size;
        this.color = color;
    }
    public Clothes(int id, String name, double size, String color) {
        super(id, name);
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "Clothes{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
