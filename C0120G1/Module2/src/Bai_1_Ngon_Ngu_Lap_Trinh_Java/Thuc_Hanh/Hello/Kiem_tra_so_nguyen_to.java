package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh.Hello;

import java.util.Scanner;

public class Kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 1 số bất kỳ");
        int number = input.nextInt();
        if (number < 2) {
            System.out.println(number + " không phải là số nguyên tố");
        }else{
            int i=2;
            boolean check=true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check=false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " là số nguyên tố");
            }else{
                System.out.println(number + " không phải là số nguyên tố");
            }
        }
    }
}
