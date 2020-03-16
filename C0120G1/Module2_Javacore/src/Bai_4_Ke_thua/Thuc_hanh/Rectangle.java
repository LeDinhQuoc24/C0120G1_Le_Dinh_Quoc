package Bai_4_Ke_thua.Thuc_hanh;

public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;
    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.width=width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width=width;
        this.length = length;
    }
    public void setWidth(double width) {
        this.width=width;
    }
    public double getWidth() {
        return this.width;
    }
    public void setLength(double length) {
        this.length=length;
    }
    public double getLength() {
        return this.length;
    }
    public double getArea() {
        return getLength() * getWidth();
    }
    public double getPerimeter() {
        return (getLength() + getWidth()) * 2;
    }
    @Override
    public String toString() {
        return "A Rectangle with width=" + getWidth() + " and length=" + getLength() + ", which is a subclass of " + super.toString();
    }
}
