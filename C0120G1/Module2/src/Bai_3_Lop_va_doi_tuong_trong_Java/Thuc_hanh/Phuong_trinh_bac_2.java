package Bai_3_Lop_va_doi_tuong_trong_Java.Thuc_hanh;

import java.util.Scanner;

public class Phuong_trinh_bac_2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a");
        int a = ip.nextInt();
        System.out.println("Enter b");
        int b = ip.nextInt();
        System.out.println("Enter c");
        int c = ip.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double x = quadraticEquation.getDiscriminant();
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("The equation has countless roots roots");
        }else{
            if (x < 0) {
                System.out.println("The equation has no roots");
            } else if (x == 0) {
                System.out.println("The equation has 1 root " + quadraticEquation.getRoot1());
            } else {
                System.out.println("The equation has 2 roots "+quadraticEquation.getRoot1()+"\t"+quadraticEquation.getRoot2());
            }
        }
    }
}
class QuadraticEquation {
    int a,b,c;
    public QuadraticEquation(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminant() {
        return Math.pow(b,2)-4*this.a*this.c;
    }
    public double getRoot1() {
        return (-this.b-Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
    }
    public double getRoot2() {
        return (-this.b+Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
    }
}