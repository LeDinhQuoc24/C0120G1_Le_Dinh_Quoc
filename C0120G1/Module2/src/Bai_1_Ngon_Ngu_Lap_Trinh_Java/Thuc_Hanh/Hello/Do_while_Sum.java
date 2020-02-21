package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh.Hello;

import java.util.Scanner;

public class Do_while_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int number;
        do {
            System.out.println("nhập 1 số bất kỳ khác 0");
            number = scanner.nextInt();
            sum+=number;

        } while (number != 0);
        System.out.println("Ket qua la "+sum);
    }
}
