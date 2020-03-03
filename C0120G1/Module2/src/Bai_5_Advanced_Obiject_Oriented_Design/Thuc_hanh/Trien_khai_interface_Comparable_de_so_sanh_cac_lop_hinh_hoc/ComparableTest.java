package Bai_5_Advanced_Obiject_Oriented_Design.Thuc_hanh.Trien_khai_interface_Comparable_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[2] = new ComparableCircle();
        comparableCircles[1] = new ComparableCircle(3.6);
        comparableCircles[0] = new ComparableCircle(3.5, "Blue", true);
        System.out.println("Pre-soft");
        for (ComparableCircle comparableCircle : comparableCircles) {
            System.out.println(comparableCircle);
        }
        Arrays.sort(comparableCircles);
        System.out.println("After-soft");
        for (ComparableCircle comparableCircle : comparableCircles) {
            System.out.println(comparableCircle);
        }


    }
}
