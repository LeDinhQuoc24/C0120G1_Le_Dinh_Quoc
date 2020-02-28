package Bai_5_Advanced_Obiject_Oriented_Design.Bai_doc;

public class Anonymous_Class {
    public static void main(String[] args) {
        HinhHoc hinhGiDo = new HinhHoc() {
            protected float banKinh;

            @Override
            public void nhapBanKinh(float banKinh) {
                this.banKinh = banKinh;
            }

            @Override
            public float tinhChuVi() {
                return 2 * 3 * banKinh;
            }

            @Override
            public float tinhDienTich() {
                return 3 * banKinh * banKinh;
            }

            @Override
            public void xuatThongTin() {
                System.out.println("Hình Vô Danh");
                System.out.println("Chu vi: " + tinhChuVi());
                System.out.println("Diện tích: " + tinhDienTich());
            }
        };

        hinhGiDo.nhapBanKinh(10);
        hinhGiDo.xuatThongTin();
    }
}
interface HinhHoc {


    float PI = 3.14f;

    void nhapBanKinh(float banKinh);

    float tinhChuVi();

    float tinhDienTich();

    void xuatThongTin();
}
