package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_2;

import javax.swing.*;
import java.util.Scanner;

public class XXX_Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        boolean check=true;
        Scanner input = new Scanner(System.in);
        while (check) {
            System.out.println("Menu:");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            int choice=input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the length of the rectangle");
                    int length=input.nextInt();
                    System.out.println("Enter the width of the rectangle");
                    int width = input.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.println("1.Top-left");
                    System.out.println("2.Top-right");
                    System.out.println("3.Botton-left");
                    System.out.println("4.Botton-right");
                    int choice2 = input.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("Enter the length of the square triangle");
                            int length2 = input.nextInt();
                            int length3=length2;
                            for (int i = 0; i < length3; i++) {
                                for (int j = 0; j < length2; j++) {
                                    System.out.print("*");
                                }
                                length2--;
                                System.out.println("");
                            }
                            break;
                        case 3:
                            System.out.println("Enter the length of the square triangle");
                            int length5 = input.nextInt();
                            int length4=0;
                            for (int i = 0; i < length5; i++) {
                                for (int j = 0; j <= length4; j++) {
                                    System.out.print("*");
                                }
                                length4++;
                                System.out.println("");
                            }
                            break;
                        case 2:
                            System.out.println("Enter the length of the square triangle");
                            int length6 = input.nextInt();
                            int length7=1;
                            for (int i = 0; i < length6; i++) {
                                for (int j = 0; j < length6; j++) {
                                    if (j < length7) {
                                        System.out.print(" ");
                                    }else{
                                        System.out.print("*");
                                    }
                                }
                                length7++;
                                System.out.println("");
                            }
                            break;
                        case 4:
                            System.out.println("Enter the length of the square triangle");
                            int length8 = input.nextInt();
                            int length9=length8;
                            for (int i = 0; i < length8; i++) {
                                for (int j = 0; j < length8; j++) {
                                    if (j < length9-1) {
                                        System.out.print(" ");
                                    }else{
                                        System.out.print("*");
                                    }
                                }
                                length9--;
                                System.out.println("");
                            }
                            break;
                        default:
                            System.out.println("Nhập lỗi.Vui lòng nhập từ 1-4");
                            continue;
                    }
                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.println("1.Top");
                    System.out.println("2.Botton");
                    int choice3 = input.nextInt();
                    switch (choice3) {
                        case 1:
                            System.out.println("Enter half the length of isosceles triangle");
                            int length10 = input.nextInt();
                            int length11=length10*2;
                            int length12=0;
                            for (int i = 0; i < length10; i++) {
                                for (int j = 0; j < length11; j++) {
                                    if (j>(length11-(length10-length12))||j<(length11-(length10+length12))){
                                        System.out.print(" ");
                                    }else{
                                        System.out.print("*");
                                    }
                                }
                                length12++;
                                System.out.println("");
                            }
                        case 2:
                            System.out.println("Enter half the length of isosceles triangle");
                            int length13 = input.nextInt();
                            int length14=length13*2;
                            int length15=0;
                            for (int i = 0; i < length13+1; i++) {
                                for (int j = 0; j < length14; j++) {
                                    if (j<length15||j>(length14-length15)){
                                        System.out.print(" ");
                                    }else{
                                        System.out.print("*");
                                    }
                                }
                                length15++;
                                System.out.println("");
                            }
                    }
                    break;
                default:
                    System.out.println("Nhập lỗi,vui lòng nhập từ 1-4");
                    break;
            }
        }
    }
}
