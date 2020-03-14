package Bai_2_Mang_va_phuong_thuc_trong_Java.Bai_Tap;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Tim_gia_tri_nho_nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Nhập độ dài của mảng");
            size = input.nextInt();
            if (size > 15 || size < 1) {
                System.out.println("Nhập độ dài của mảng từ 1-15");
            }
        } while (size > 15 || size < 1);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 4);
            System.out.print(array[i]+"\t");
        }
        int min= array[0];
        String index = " vị trí 0 ";
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index=" vị trí "+(i+1);
            } else if (array[i] == min) {
                index+="\t"+" vị trí "+(i+1);
            }
        }
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("Giá trị nhỏ nhất của mảng là "+min+" tại "+index);
    }
}
