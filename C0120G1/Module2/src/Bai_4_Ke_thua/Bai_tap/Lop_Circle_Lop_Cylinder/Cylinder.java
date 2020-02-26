package Bai_4_Ke_thua.Bai_tap.Lop_Circle_Lop_Cylinder;

public class Cylinder extends Circle{
    private double height=10;
    public Cylinder() {
    }
    public Cylinder(double height) {
        this.height=height;
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height=height;
    }
    public void setHeight(double height) {
        this.height=height;
    }
    public double getHeight() {
        return this.height;
    }
    public double getArea2() {
        return 2*Math.PI*getRadius()*(getHeight()+getRadius());
        //2xPixR2+2xRixRxh=2xPixRx(R+h)
    }
    public double getVolumetric() {
        return Math.PI*Math.pow(getRadius(),2)*getHeight();
    }
    @Override
    public String toString() {
        return "A Cylinder with Radius: "+getRadius()
                +" and Height "+getHeight()
                +" and Area "+getArea2()
                +" and Volumetric "+getVolumetric()
                +",which is a subclass of "+super.toString();
    }
}
