package Bai_5_Advanced_Obiject_Oriented_Design.Thuc_hanh.Trien_khai_interface_Comparable_de_so_sanh_cac_lop_hinh_hoc;

public class ComparableCircle extends Circle1 implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle comparableCircle) {
        if(getRadius()>=comparableCircle.getRadius()) return 1;
        else return -1;
    }
}
