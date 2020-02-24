package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_2;

import java.util.Scanner;

public class Tinh_chi_so_can_nang_co_the {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng");
        double weight = input.nextDouble();
        System.out.println("Nhập vào chiều cao");
        double height = input.nextDouble();
        double bmi;
        bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5) {
            System.out.println("Underweight");
        } else if (bmi > 18.5 && bmi <= 25) {
            System.out.println("Normal");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
