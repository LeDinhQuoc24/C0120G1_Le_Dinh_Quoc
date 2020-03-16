package Bai_5_Advanced_Obiject_Oriented_Design.Bai_tap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

import java.util.Random;

public class Circle extends Shape implements Resizeable{

    private double radius=1.0;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled ) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
    @Override
    public void resize(double percentRadius) {
        this.setRadius(this.getRadius() * percentRadius);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +","+
                (isFilled()?"filled":"not filled")+
                '}';
    }


}
