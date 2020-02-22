package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_2;

import java.util.Scanner;

public class Thiet_ke_cho_menu_ung_dung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check=true;
        int choice;
        while (check){
        System.out.println("Menu");
        System.out.println("1.Vẽ hình tam giác");
        System.out.println("2.Vẽ hình chữ nhật");
        System.out.println("3.Vẽ hình vuông");
        System.out.println("4.Thoát");
        System.out.println("Nhập lựa chọn của bạn");
        choice =input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("    *");
                System.out.println("   **");
                System.out.println("  ****");
                System.out.println(" ******");
                System.out.println("********");
                break;
            case 2:
                System.out.println("***************");
                System.out.println("***************");
                System.out.println("***************");
                break;
            case 3:
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                System.out.println("*********");
                break;
            case 4:
                check=false;
                break;
            default:
                System.out.println("Nhập lỗi");
        }
        }
    }

}
