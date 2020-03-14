package Bai_2_Mang_va_phuong_thuc_trong_Java.Bai_Tap;

import java.util.Scanner;

public class Dem_so_lan_xuat_hien_trong_chuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kỳ");
        String str = input.nextLine();
        System.out.println("Nhập 1 ký tự bất kỳ");
        char icon = input.nextLine().charAt(0);
        int count =0;
        String index = "";
        for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) == icon) {
                count++;
                 index += (i+1) + ",";
            }
        }
        System.out.println("Số lần xuất hiện của ký tự "+icon+" là "+count+" lần,tại các vị trí "+index);
    }
}
