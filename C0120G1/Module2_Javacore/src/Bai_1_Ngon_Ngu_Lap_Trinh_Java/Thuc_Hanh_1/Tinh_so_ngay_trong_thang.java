package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_1;

import java.util.Scanner;

public class Tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tháng bất kỳ 1-12");
        int nhapThang = input.nextInt();
        switch (nhapThang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+nhapThang+" có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+nhapThang+" có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng "+nhapThang+" có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("nhập lỗi");

        }
    }
}
