package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_2;

import java.util.Scanner;

public class XXX_Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        boolean check=true;
        Scanner input = new Scanner(System.in);
        while (check) {
            System.out.println("Menu:");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            int choice=input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài hình chữ nhật");
                    float length=input.nextFloat();
                    System.out.println("Nhập chiều rộng hình chữ nhật");
                    float width = input.nextFloat();

            }



        }
    }
}
