package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh.Hello;


import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner hungdepgai = new Scanner(System.in);
        int so1 = hungdepgai.nextInt();
        int so2 = hungdepgai.nextInt();
        int ketQua=hungdepgai.nextInt();
        while (so1 + so2 != ketQua) {
            System.out.print("sai kết quả");
            ketQua=hungdepgai.nextInt();
        }
        System.out.println("đúng kết quả");
    }
}
