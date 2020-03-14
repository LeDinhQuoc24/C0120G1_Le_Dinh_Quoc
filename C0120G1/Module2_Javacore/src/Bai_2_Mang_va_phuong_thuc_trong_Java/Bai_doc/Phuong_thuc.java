package Bai_2_Mang_va_phuong_thuc_trong_Java.Bai_doc;

public class Phuong_thuc {
    public static void main(String[] args) {
        System.out.println("Tổng từ 1-10: "+sum(1,10));
        System.out.println("Tổng từ 20-30: "+sum(20,30));
        System.out.println("Tổng từ 40-50: "+sum(40,50));
    }
    public static int sum(int i1, int i2) {
        int ketQua=0;
        for (int i = i1; i <= i2; i++) {
            ketQua+=i;
        }
        return ketQua;
    }
}
