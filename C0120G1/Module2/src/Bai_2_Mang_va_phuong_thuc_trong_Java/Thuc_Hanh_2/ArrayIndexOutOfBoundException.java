package Bai_2_Mang_va_phuong_thuc_trong_Java.Thuc_Hanh_2;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundException {
        public Integer[] createRandom() {
            Random rd = new Random();
            Integer[] array = new Integer[100];
            System.out.println("Hiển thị mảng với 100 phần tử ngẫu nhiên");
            for (int i = 0; i < array.length; i++) {
                array[i] = rd.nextInt(100);
                System.out.print(array[i]+"\t");
            }
            return array;
        }

        public static void main(String[] args) {
            ArrayIndexOutOfBoundException arrayExample=new ArrayIndexOutOfBoundException();
            Integer[] array = arrayExample.createRandom();
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.println("Nhập chỉ số của một phần tử bất kỳ");
            int x = input.nextInt();
            try {
                System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + array[x]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Chỉ số vượt quá giá trị của mảng");
            }

        }
}
