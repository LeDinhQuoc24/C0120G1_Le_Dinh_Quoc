package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_2;

import java.util.Scanner;

public class Ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check=true;
        while (check) {
            System.out.println("Lựa chọn tính năng:");
            System.out.println("1.Chuyển sang mệnh giá VND");
            System.out.println("2.Chuyển sang mệnh giá USD");
            System.out.println("3.Thoát");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Vui lòng nhập số tiền USD cần quy đổi");
                    int tienUSD1 = input.nextInt();
                    int tienVND1=tienUSD1*23000;
                    System.out.println("quy đổi thành "+tienVND1+" VND");
                    break;
                case 2:
                    System.out.println("Vui lòng nhập số tiền VND cần quy đổi");
                    int tienVND2 = input.nextInt();
                    int tienUSD2=tienVND2/23000;
                    System.out.println("quy đổi thành "+tienUSD2+" USD");
                    break;
                case 3:
                    System.out.println("Cảm ơn quý khách đã sử dụng dịch vụ của chúng tôi");
                    check=false;
                    break;
                default:
                    System.out.println("Nhập lỗi,vui lòng nhập lại");
            }
        }
    }
}
