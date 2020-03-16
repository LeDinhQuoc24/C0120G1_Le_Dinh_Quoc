package Bai_2_Mang_va_phuong_thuc_trong_Java.Thuc_Hanh;

import java.util.Scanner;

public class Chuyen_doi_do_C_sang_do_F {

    public static void main(String[] args) {
        boolean check=true;
        Scanner input = new Scanner(System.in);
        while(check) {
            System.out.println("Menu:");
            System.out.println("1.Celsius to Fahrenheit");
            System.out.println("2.Fahrenheit to Celsius");
            System.out.println("3.Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter value Calsius:");
                    double calsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit " + celsiusToFahrenheit(calsius));
                    break;
                case 2:
                    System.out.println("Enter value Fahrenheit:");
                    double fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * (5.0 / 9);
        return celsius;
    }

}
