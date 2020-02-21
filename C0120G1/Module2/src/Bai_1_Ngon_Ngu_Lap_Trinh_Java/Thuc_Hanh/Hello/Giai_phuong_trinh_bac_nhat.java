package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh.Hello;

import java.util.Scanner;

public class Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào giá trị a của ptb1 ax+b=0");
        double nhap_a = input.nextDouble();
        System.out.println("nhập vào giá trị b của ptb1 ax+b=0");
        double nhap_b = input.nextDouble();
        if (nhap_a == 0) {
            if (nhap_b == 0) {
                System.out.println("phương trình vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            System.out.println("phương trình có nghiêm là "+(-nhap_b/nhap_a));
        }
    }
}
