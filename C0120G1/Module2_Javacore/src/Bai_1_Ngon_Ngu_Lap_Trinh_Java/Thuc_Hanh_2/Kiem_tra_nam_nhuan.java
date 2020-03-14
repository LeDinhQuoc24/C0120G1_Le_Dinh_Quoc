package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_2;

import java.util.Scanner;

public class Kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 1 năm bất kỳ");
        int year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "  là năm nhuận");
                }else{
                    System.out.println(year + " không phải là năm nhuận");
                }
            }else{
                System.out.println(year + " là năm nhuận");
            }
        }else{
            System.out.println(year + " không phải là năm nhuận");
        }
    }
}
