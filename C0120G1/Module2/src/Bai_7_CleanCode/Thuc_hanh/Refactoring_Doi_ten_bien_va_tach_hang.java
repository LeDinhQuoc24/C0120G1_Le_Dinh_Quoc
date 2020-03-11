package Bai_7_CleanCode.Thuc_hanh;

import java.util.Scanner;

public class Refactoring_Doi_ten_bien_va_tach_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất:");
        int number1 = sc.nextInt();
        System.out.println("Nhập số thứ hai:");
        int number2 = sc.nextInt();
        System.out.println("Kết quả cộng");
        System.out.println(calculate(number1, number2, ADDITION));
        System.out.println("Kết quả trừ");
        System.out.println(calculate(number1, number2, SUBTRACTION));
        System.out.println("Kết quả nhân");
        System.out.println( calculate(number1, number2, MULTIPLICATION));
        System.out.println("Kết quả chia");
        System.out.println(calculate(number1, number2, DIVISION));

    }
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
