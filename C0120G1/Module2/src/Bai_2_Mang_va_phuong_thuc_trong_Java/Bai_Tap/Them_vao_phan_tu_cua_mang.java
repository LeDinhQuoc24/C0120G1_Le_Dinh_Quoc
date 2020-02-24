package Bai_2_Mang_va_phuong_thuc_trong_Java.Bai_Tap;

import java.util.Scanner;

public class Them_vao_phan_tu_cua_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Nhập độ dài của mảng");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Nhập độ dài mảng không vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int index;
        do {
            System.out.println("Chọn vị trí phần tử cần gán giá trị");
            index = input.nextInt();
            if (index > size) {
                System.out.println("Nhập vị trí cần gán không vượt quá độ dài mảng");
            }
        } while (index > size);
        System.out.println("Chọn giá trị cần gán");
        array[index-1] = input.nextInt();
        System.out.println("Hiển thị các phần tử của mảng");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
