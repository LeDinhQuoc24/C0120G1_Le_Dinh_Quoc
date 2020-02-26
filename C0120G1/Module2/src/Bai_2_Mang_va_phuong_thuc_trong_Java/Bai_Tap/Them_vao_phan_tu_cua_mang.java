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
        System.out.println("Hiển thị mảng tạo ngẫu nhiên");
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i]+"\t");
        }
        System.out.println("");
        do {
            System.out.println("Chọn vị trí phần tử cần gán giá trị");
            index = input.nextInt();
            if (index > size) {
                System.out.println("Nhập vị trí cần gán không vượt quá độ dài mảng");
            }
            if (index < 1) {
                System.out.println("Nhập vị trí cần gán lớn hơn 1");
            }
        } while (index > size||index<1);
        System.out.println("Chọn giá trị cần gán");
        int value = input.nextInt();
        System.out.println("Hiển thị các phần tử của mảng");
        int[]array2=new int[size+1];
        for (int i = 0; i < size+1; i++) {
            if (i < (index - 1)) {
                array2[i] = array[i];
            } else if (i == (index - 1)) {
                array2[i]=value;
            }else{
                array2[i] = array[i - 1];
            }
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+"\t");
        }
    }
}
