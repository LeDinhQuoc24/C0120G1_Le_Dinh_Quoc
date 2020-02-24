package Bai_2_Mang_va_phuong_thuc_trong_Java.Thuc_Hanh;

import java.sql.Array;
import java.util.Scanner;

public class Gia_tri_lon_nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Nhập độ dài mảng");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Nhập độ dài mảng không vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần thứ thứ "+(i+1));
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        int max = array[0];
        int index=0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index=i+1;
            }
        }
        System.out.println("Phần tử lớn nhất của mảng có giá trị "+max+" tại vị trí "+index);
    }
}

