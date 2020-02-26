package Bai_4_Ke_thua.Bai_tap.Lop_Circle_Lop_Cylinder;

public class Call_Cylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(20);
        System.out.println(cylinder);
        cylinder = new Cylinder(30, 5, "White");
        System.out.println(cylinder);
    }
}
