package Bai_2_Mang_va_phuong_thuc_trong_Java.Bai_Tap;

import java.util.Scanner;

public class Tinh_tong_cac_so_o_duong_cheo_chinh_cua_ma_tran_vuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int size;
        do {
            System.out.println("Nhập độ dài cạnh của ma trận vuông");
            size = input.nextInt();
            if (size > 20 || size < 1) {
                System.out.println("Nhập độ dài cạnh của ma trận vuông từ 2-20");
            }
        } while (size > 20 || size < 2);
        System.out.println("Hiển thị ma trận tạo thành ngẫu nhiên");
        array = new int[size][size];
        String ketQua = "";
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 15);
                System.out.print(array[i][j] + "\t");
                if (j==i) {
                    ketQua += array[i][j] + "\t";
                    sum += array[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("Hiển thị  các phần tử ở đường chéo chính");
        System.out.println(ketQua);
        System.out.println("Hiển thị tổng các phần tử ở đường chéo chính");
        System.out.println(sum);
    }
}
