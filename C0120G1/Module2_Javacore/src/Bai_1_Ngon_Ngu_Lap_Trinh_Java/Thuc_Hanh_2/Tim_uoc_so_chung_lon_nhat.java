package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_2;

import java.util.Scanner;

public class Tim_uoc_so_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        float a = input.nextFloat();
        System.out.println("Nhập số thứ hai");
        float b = input.nextFloat();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        } else if (a == b) {
            System.out.println("Ước chung lớn nhất là " + a);
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else if (a < b) {
                    b-=a;
                }
            }
            System.out.println("Ước chung lớn nhất là "+a);
        }

    }
}
