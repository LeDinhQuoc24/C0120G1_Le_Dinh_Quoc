package Bai_2_Mang_va_phuong_thuc_trong_Java.Thuc_Hanh_2;

import java.util.Scanner;

public class Ung_dung_dem_so_luong_sinh_vien_thi_do {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Nhập số lượng sinh viên");
            size = input.nextInt();
            if (size > 30 || size < 1) {
                System.out.println("Nhập số lượng sinh viên từ 1-30");
            }
        } while (size > 30 || size < 1);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập điểm số của sinh viên thứ " + (i + 1));
            array[i] = input.nextInt();
        }
        System.out.println("Hiển thị danh sách sinh viên thi đỗ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 10) {
                System.out.println("Sinh viên thứ " + (i + 1) + ",điểm thi là: " + array[i]);
            }
        }
    }
}
