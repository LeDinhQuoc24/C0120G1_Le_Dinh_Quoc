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
        String display = valueMin(array);
        System.out.println(display);
    }
    public static String valueMin(int[] array) {
        String index="1";
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index=""+(i+1);
            } else if (array[i]==min) {
                index += "," + (i + 1);
            }
        }
        return "Mảng có phần tử nhỏ nhất có giá trị "+min+" tại vị trí "+index;
    }
}
