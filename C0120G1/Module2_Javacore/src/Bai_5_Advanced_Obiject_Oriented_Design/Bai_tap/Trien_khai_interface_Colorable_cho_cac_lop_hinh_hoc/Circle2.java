package Bai_5_Advanced_Obiject_Oriented_Design.Bai_tap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class Circle2 extends Shape2{
    double radius=1.0;

    public Circle2() {
    }
    public Circle2(double radius) {
        this.radius = radius;
    }
    public Circle2(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getArea() {
        return "Area of Circle: " + Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Circle2{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
