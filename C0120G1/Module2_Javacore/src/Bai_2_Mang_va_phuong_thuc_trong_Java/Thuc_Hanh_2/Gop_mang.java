package Bai_2_Mang_va_phuong_thuc_trong_Java.Thuc_Hanh_2;

import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1;
        int[] array2;
        int size1;
        int size2;
        do {
            System.out.println("Nhập độ dài mảng 1");
            size1 = input.nextInt();
            if (size1 > 15 || size1 < 1) {
                System.out.println("Nhập độ dài mảng 1 từ 1-15");
            }
        } while (size1 > 15 || size1 < 1);
        array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 50);
            System.out.print(array1[i]+"\t");
        }
        System.out.println("");
        do {
            System.out.println("Nhập độ dài mảng 2");
            size2 = input.nextInt();
            if (size2 > 15 || size2 < 1) {
                System.out.println("Nhập độ dài mảng 2 từ 1-15");
            }
        } while (size2 > 15 || size2 < 1);
        array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 50);
            System.out.print(array2[i]+"\t");
        }
        System.out.println("");
        System.out.println("Gộp 2 mảng");
        int[] array3;
        array3=new int[size1+size2];
        for (int i = 0; i < array3.length; i++) {
            if (i < size1) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - size1];
            }
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]+"\t");
        }
    }
}
