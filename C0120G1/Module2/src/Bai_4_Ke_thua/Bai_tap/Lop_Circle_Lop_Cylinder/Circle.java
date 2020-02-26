package Bai_4_Ke_thua.Bai_tap.Lop_Circle_Lop_Cylinder;

public class Circle {
    private double radius=1.0;
    private String color = "purple";
    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius=radius;
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public String getColor() {
        return this.color;
    }
    public double getArea() {
        return Math.PI*Math.pow(getRadius(),2);
    }
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
    @Override
    public String toString() {
        return "A Circle with Radius: "+getRadius()
                +" and Color: "+getColor()
                +" and Area: "+getArea()
                +" and Perimeter "+getPerimeter();
    }
}

