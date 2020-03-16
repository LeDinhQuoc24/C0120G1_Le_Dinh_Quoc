package Bai_5_Advanced_Obiject_Oriented_Design.Bai_tap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class Rectangle2 extends Shape2{
    double length=1.0;
    double width=1.0;

    public Rectangle2() {
    }

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle2(String color, boolean filled, double length, double width) {
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
    public String getArea() {
        return "Area of Rectangle: " + getWidth() * getLength();
    }

    @Override
    public String toString() {
        return "Rectangle2{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
