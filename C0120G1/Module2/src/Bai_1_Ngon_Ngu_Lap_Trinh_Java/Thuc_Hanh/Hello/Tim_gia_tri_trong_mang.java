package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh.Hello;

import java.util.Scanner;

public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[]students={"Nam", "Hoang", "Quoc", "Hung", "Thong", "Cuong"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 tên sinh viên");
        String nhap_ten=scanner.nextLine();
        boolean check=true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nhap_ten)) {
                System.out.println("Vị trí của sinh viên "+nhap_ten+" là "+(i+1));
                check=false;
                break;
            }
        }
        if(check)
            System.out.println("Không tìm thấy vị trí "+nhap_ten+" trong danh sách");
    }
}
