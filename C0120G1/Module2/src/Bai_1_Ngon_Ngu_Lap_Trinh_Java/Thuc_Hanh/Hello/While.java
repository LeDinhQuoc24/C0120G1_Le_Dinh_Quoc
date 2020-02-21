package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh.Hello;


import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int so1 = input.nextInt();
        int so2 = input.nextInt();
        int ketQua=input.nextInt();
        while (so1 + so2 != ketQua) {
            System.out.print("sai kết quả");
            ketQua=input.nextInt();
        }
        System.out.println("đúng kết quả");
    }
}
