package Bai_2_Mang_va_phuong_thuc_trong_Java.Thuc_Hanh;

import java.util.Scanner;

public class Tim_phan_tu_nho_nhat_cua_mang_su_dung_phuong_thuc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Nhập độ dài của mảng");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Nhập độ dài của mảng không vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = input.nextInt();
        }
        System.out.println("Hiển thị các phần tử của mảng");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        int index = valueMin(array);
        System.out.println("Phần tử nhỏ nhất của mảng có giá trị "+array[index]+" tại vị trí "+(index+1));
    }
    public static int valueMin(int[] array) {
        int index=0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index=i;
            }
        }
        return index;
    }
}
