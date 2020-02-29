package Bai_5_Advanced_Obiject_Oriented_Design.Thuc_hanh.Trien_khai_interface_Comparator_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Arrays;
import java.util.Comparator;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0] = new Rectangle(5, 6);
        rectangle[1] = new Rectangle("Red", true, 9, 10);
        rectangle[2] = new Rectangle();




        System.out.println("Pre-sorted");
        for (Rectangle rectangle1 : rectangle) {
            System.out.println(rectangle1);
        }
        Comparator RectangleComparator = new RectangleComparator();
        Arrays.sort(rectangle,RectangleComparator);

        System.out.println("After-sorted");
        for (Rectangle rectangle1 : rectangle) {
            System.out.println(rectangle1);
        }


    }
}
