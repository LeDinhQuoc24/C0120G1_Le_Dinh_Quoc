package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class Ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số bất kỳ nhỏ hơn 100");
        int number = scanner.nextInt();
        if (number < 10) {
            switch (number) {
                case 0 :
                    System.out.println("Không");
                    break;
                case 1 :
                    System.out.println("Một");
                    break;
                case 2 :
                    System.out.println("Hai");
                    break;
                case 3 :
                    System.out.println("Ba");
                    break;
                case 4 :
                    System.out.println("Bốn");
                    break;
                case 5 :
                    System.out.println("Năm");
                    break;
                case 6 :
                    System.out.println("Sáu");
                    break;
                case 7 :
                    System.out.println("Bảy");
                    break;
                case 8 :
                    System.out.println("Tám");
                    break;
                case 9 :
                    System.out.println("Chín");
            }
        }else if (number < 100) {
            int soHangChuc=number/10;
            int soHangDonVi=number%10;
            switch (soHangChuc) {
                case 1 :
                    System.out.print("Mười");
                    break;
                case 2 :
                    System.out.print("Hai mươi");
                    break;
                case 3 :
                    System.out.print("Ba mươi");
                    break;
                case 4 :
                    System.out.print("Bốn mươi");
                    break;
                case 5 :
                    System.out.print("Năm mươi");
                    break;
                case 6 :
                    System.out.print("Sáu mươi");
                    break;
                case 7 :
                    System.out.print("Bảy mươi");
                    break;
                case 8 :
                    System.out.print("Tám mươi");
                    break;
                case 9 :
                    System.out.print("Chín mươi");
            }
            switch (soHangDonVi){
                case 0 :
                    System.out.print("");
                    break;
                case 1 :
                    if (number < 20) {
                        System.out.print(" một");
                    }else{
                        System.out.print(" mốt");
                    }
                    break;
                case 2 :
                    System.out.print(" hai");
                    break;
                case 3 :
                    System.out.print(" ba");
                    break;
                case 4 :
                    System.out.print(" bốn");
                    break;
                case 5 :
                    System.out.print(" năm");
                    break;
                case 6 :
                    System.out.print(" sáu");
                    break;
                case 7 :
                    System.out.print(" bảy");
                    break;
                case 8 :
                    System.out.print(" tám");
                    break;
                case 9 :
                    System.out.print(" chín");
            }
        }else{
            System.out.println("Trình code có hạn nên vui lòng nhập số nhỏ hơn 100 @@");
        }
    }
}
