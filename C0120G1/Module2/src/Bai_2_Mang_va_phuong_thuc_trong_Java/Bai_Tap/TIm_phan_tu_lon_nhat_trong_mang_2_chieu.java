package Bai_2_Mang_va_phuong_thuc_trong_Java.Bai_Tap;

import java.lang.ref.SoftReference;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TIm_phan_tu_lon_nhat_trong_mang_2_chieu {
    public static void main(String[] args) {
        int[][] array;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng");
        int row = input.nextInt();
        System.out.println("Nhập số cột của mảng");
        int cottum = input.nextInt();
        array = new int[row][cottum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cottum; j++) {
                array[i][j] = (int)(Math.random() * 100);
            }
        }
        System.out.println("Hiển thị các phần tử của mảng");
        int max=array[0][0];
        String index="dòng 0 cột 0";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cottum; j++) {
                System.out.print(array[i][j]+"\t");
                if (array[i][j] > max) {
                    max = array[i][j];
                    index = "dòng " + (i + 1) + " cột " + (j + 1);
                } else if (array[i][j] == max) {
                    index += "\t" + "dòng " + (i + 1) + " cột " + (j + 1);
                }
            }
            System.out.println("");
        }
        System.out.println("Phần tử lón nhất trong mảng có giá trị "+max+" tại vị trí "+index);

    }
}
