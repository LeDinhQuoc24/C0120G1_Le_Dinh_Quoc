package Bai_4_Ke_thua.Thuc_hanh;

public class He_cac_doi_tuong_hinh_hoc_Square {


    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}

