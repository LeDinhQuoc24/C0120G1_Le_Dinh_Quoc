package Bai_5_Advanced_Obiject_Oriented_Design.Thuc_hanh.Trien_khai_interface_Comparator_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle rect1, Rectangle rect2) {
        if (rect1.getLength() > rect2.getLength()) {
            return 1;
        } else if (rect1.getLength() < rect2.getLength()) {
            return -1;
        } else {
            return 0;
        }
    }
}
