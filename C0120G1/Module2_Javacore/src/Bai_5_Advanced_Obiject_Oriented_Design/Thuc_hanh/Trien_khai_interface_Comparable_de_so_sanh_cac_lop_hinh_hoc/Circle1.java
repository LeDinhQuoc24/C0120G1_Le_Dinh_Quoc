package Bai_5_Advanced_Obiject_Oriented_Design.Thuc_hanh.Trien_khai_interface_Comparable_de_so_sanh_cac_lop_hinh_hoc;

import Bai_5_Advanced_Obiject_Oriented_Design.Thuc_hanh.Trien_khai_interface_Comparator_de_so_sanh_cac_lop_hinh_hoc.Shape;

public class Circle1 extends Shape{
    private double radius=1.0;
    public Circle1() {
    }
    public Circle1(double radius) {
        this.radius = radius;
    }
    public Circle1(double radius, String color, boolean filled ) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
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
