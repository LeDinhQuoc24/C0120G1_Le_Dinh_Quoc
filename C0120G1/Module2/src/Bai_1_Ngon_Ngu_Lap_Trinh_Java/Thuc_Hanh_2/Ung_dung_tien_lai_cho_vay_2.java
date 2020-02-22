package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_2;

import java.util.Scanner;

public class Ung_dung_tien_lai_cho_vay_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi");
        double tienGui = input.nextDouble();
        System.out.println("Nhập tỉ lệ lãi");
        double tiLeLai = input.nextDouble();
        System.out.println("Nhập số tháng gửi");
        int soThangGui = input.nextInt();
        double soTienLai1=0;
        for (int i = 0; i < soThangGui; i++) {
            double soTienLai=tienGui*(tiLeLai/100)/12;
            soTienLai1+=soTienLai;
            tienGui+=soTienLai1;
        }
        System.out.println("Số tiền lãi nhận được "+ soTienLai1);
    }
}
