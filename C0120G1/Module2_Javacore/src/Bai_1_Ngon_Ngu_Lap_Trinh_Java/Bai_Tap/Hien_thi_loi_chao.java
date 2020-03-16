package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class Hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String name = input.nextLine();
        System.out.println("Hello "+name);
    }
}
