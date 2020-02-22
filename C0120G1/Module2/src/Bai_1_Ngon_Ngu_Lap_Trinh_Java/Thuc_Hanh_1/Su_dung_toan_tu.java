package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_1;

import java.util.Scanner;

public class Su_dung_toan_tu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng hình chữ nhật: ");
        double nhapChieuRong=input.nextDouble();
        System.out.println("Nhập vào chiều dài hình chữ nhật: ");
        double nhapChieuDai = input.nextDouble();
        System.out.println("Diện tích hình chữ nhật là: "+nhapChieuDai*nhapChieuRong);
    }
}
