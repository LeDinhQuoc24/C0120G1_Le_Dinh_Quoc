package Bai_4_Ke_thua.Thuc_hanh;

public class He_cac_doi_tuong_hinh_hoc_Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
