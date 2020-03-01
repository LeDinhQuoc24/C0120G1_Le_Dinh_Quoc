package Bai_5_Advanced_Obiject_Oriented_Design.Bai_tap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

import Bai_5_Advanced_Obiject_Oriented_Design.Bai_tap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Shape;

public class Main {
    public static void main(String[] args) {
        Shape2[] shape2 = new Shape2[3];
        shape2[0] = new Circle2("White",true,19);
        shape2[1] = new Rectangle2("Purple", false, 24, 12);
        shape2[2] = new Squire2("Green", true, 89);
        for (Shape2 shape2x : shape2) {
            System.out.println(shape2x.getArea());
            if (shape2x instanceof Squire2) {
                Colorable colorable=(Squire2)shape2x;
                colorable.howToColor();
            }
        }
    }
}
