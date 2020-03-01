package Demo.Validate.Controller;

import Demo.Validate.Models.Vo_Minh_Hung;
import Demo.Validate.Views.Validation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vo_Minh_Hung vo_minh_hung = new Vo_Minh_Hung();
        System.out.println("Nhap tuoi cua Vo Minh Hung");
        vo_minh_hung.setAge(Validation.checkAndGetNumber("Vui long nhap so hop le"));
    }

}
