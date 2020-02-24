package Bai_2_Mang_va_phuong_thuc_trong_Java.Thuc_Hanh;

import com.sun.security.jgss.GSSUtil;

import java.util.Collection;
import java.util.Scanner;

public class Dao_nguoc_cac_phan_tu_cua_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhập độ dài của mảng");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Nhập độ dài mảng không vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = input.nextInt();
        }
        System.out.println("Hiển thị mảng trước khi bị đảo ngược");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp=array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("");
        System.out.println("Hiển thị mảng sau khi bị đảo ngược");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
