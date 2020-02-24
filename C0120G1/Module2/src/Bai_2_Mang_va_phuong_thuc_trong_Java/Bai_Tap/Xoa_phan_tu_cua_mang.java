package Bai_2_Mang_va_phuong_thuc_trong_Java.Bai_Tap;

import java.util.Scanner;

public class Xoa_phan_tu_cua_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Nhập độ dài của mảng");
            size = input.nextInt();
            if (size > 30 || size < 1) {
                System.out.println("Nhập độ dài của mảng từ 1-30");
            }
        } while (size > 30 || size < 1);
        array = new int[size];
        System.out.println("Mảng tạo ngẫu nhiên:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5);
            System.out.print(array[i]+"\t");
        }
        System.out.println("");
        System.out.println("Nhập giá trị ngẫu nhiên cần xóa");
        int number = input.nextInt();
        String index = "";
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index += (i + 1)+",";
                count++;
            }
        }
        int[] array2=new int [array.length-count];
        System.out.println("Giá trị muốn xóa được tìm thấy "+count+" lần, tại các vị trí " + index);
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=number){
                array2[j] = array[i];
                j++;
            }
        }
        System.out.println("Hiển thị mảng sau khi xóa:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+"\t");
        }
    }
}
