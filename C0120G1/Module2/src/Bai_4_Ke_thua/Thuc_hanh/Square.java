package Bai_4_Ke_thua.Thuc_hanh;

public class Square extends Rectangle{
    private double side=1.0;
    public Square() {
    }
    public Square(double side) {
        super(side,side);
    }
    public Square(double side,String color,boolean filled) {
        super(side,side,color,filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide() {
        setLength(side);
        setWidth(side);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
