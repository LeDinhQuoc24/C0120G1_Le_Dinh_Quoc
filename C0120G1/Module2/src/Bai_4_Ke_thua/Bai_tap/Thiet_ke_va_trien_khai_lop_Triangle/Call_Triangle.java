package Bai_4_Ke_thua.Bai_tap.Thiet_ke_va_trien_khai_lop_Triangle;

import java.util.Scanner;

public class Call_Triangle {
    public static void main(String[] args) {
        Trianle trianle = new Trianle();
        System.out.println(trianle);
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh thứ nhất");
        double a = input.nextDouble();
        System.out.println("Nhập độ dài cạnh thứ hai");
        double b = input.nextDouble();
        System.out.println("Nhập độ dài cạnh thứ ba");
        double c = input.nextDouble();
        System.out.println("Nhập màu sắc của tam giác");
        String d = input.next();
        trianle = new Trianle(d,a, b, c);
        System.out.println(trianle);
    }
}
