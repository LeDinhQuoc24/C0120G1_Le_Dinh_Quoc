package Bai_5_Advanced_Obiject_Oriented_Design.Bai_tap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

import org.w3c.dom.ls.LSOutput;

public class Squire2 extends Rectangle2 implements Colorable{
    double size=1.0;

    public Squire2() {
    }
    public Squire2(double size) {
        this.size = size;
    }
    public Squire2(String color, boolean filled, double size) {
        super(color, filled, size, size);
        this.size = size;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public String getArea() {
        return "Area of Squire: " + Math.pow(getSize(), 2);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
