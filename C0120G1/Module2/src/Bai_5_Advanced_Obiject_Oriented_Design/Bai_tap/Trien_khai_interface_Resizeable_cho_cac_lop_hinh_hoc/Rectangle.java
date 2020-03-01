package Bai_5_Advanced_Obiject_Oriented_Design.Bai_tap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class Rectangle extends Shape implements Resizeable{
    private double length=1.0;
    private double width=1.0;
    public Rectangle() {
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public void resize(double percent) {
        this.setLength(this.getLength()*percent);
        this.setWidth(this.getWidth()*percent);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
