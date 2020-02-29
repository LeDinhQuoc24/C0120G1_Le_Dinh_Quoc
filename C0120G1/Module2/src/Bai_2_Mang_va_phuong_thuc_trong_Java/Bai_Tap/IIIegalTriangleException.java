package Bai_2_Mang_va_phuong_thuc_trong_Java.Bai_Tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IIIegalTriangleException {
    public IIIegalTriangleException() {

    }
    public static void main(String[] args) {
        input();
    }

    public  static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài 3 cạnh của 1 tam giác:");
        int a;
        do {
            System.out.println("Nhập độ dài cạnh thứ nhất");
            a = check("Nhập số nguyên");
            if(a<=0) {
                System.out.println("Nhập giá trị lớn hơn 0");
            }
        } while (a <= 0);
        int b;
        do {
            System.out.println("Nhập độ dài cạnh thứ hai");
            b = check("Nhập số nguyên");
            if(b<=0) {
                System.out.println("Nhập giá trị lớn hơn 0");
            }
        } while (b <= 0);
        int c;
        do {
            System.out.println("Nhập độ dài cạnh thứ ba");
            c = check("Nhập số nguyên");
            if(c<=0) {
                System.out.println("Nhập giá trị lớn hơn 0");
            }
        } while (c <= 0);
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Nhập hợp lệ");
            System.out.println("Độ dài 3 cạnh tam giác nhập vào có giá trị là: "+a+"\t"+b+"\t"+c);
        }else{
            System.out.println("Nhập độ dài 2 cạnh lớn hơn cạnh còn lại");
        }



    }

    public  static int check(String contentError) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(contentError);
            }
        }
    }
}
