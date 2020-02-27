package Bai_4_Ke_thua.Bai_tap.Thiet_ke_va_trien_khai_lop_Triangle;

public class Trianle extends Shape{
    private double size1=1.0;
    private double size2=1.0;
    private double size3=1.0;
    public Trianle() {
    }
    public Trianle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public Trianle(String color, double size1, double size2, double size3) {
        super(color);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }
    public double getSize2() {
        return size2;
    }
    public double getSize3() {
        return size3;
    }
    public void setSize1(double size1) {
        this.size1 = size1;
    }
    public void setSize2(double size2) {
        this.size2 = size2;
    }
    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public double getArea() {
        double p = (this.getSize1() + this.getSize2() + this.getSize3()) / 2;
        return Math.sqrt(p * (p - this.getSize1()) * (p - this.getSize2()) * (p - this.getSize3()));
    }
    public double getPerimetre() {
        return this.getSize1() + this.getSize2() + this.getSize3();
    }
    public String toString() {
        return "A Triangle with size1: " + this.getSize1() +
                " size2: " + this.getSize2() +
                " size3 " + this.getSize3() +
                " Area: " + this.getArea() +
                " Perimetre " + this.getPerimetre() +
                " " + super.toString();
    }
}
