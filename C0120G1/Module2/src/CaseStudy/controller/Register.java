package CaseStudy.controller;

import java.util.Scanner;

public class Register {
    public static void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select type Register");
        System.out.println("1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to Menu");
        switch (sc.nextInt()) {
            case 1:
                RegisterVilla.registerVilla();
                break;
            case 2:
                RegisterHouse.registerHouse();
                break;
            case 3:
                RegisterRoom.registerRoom();
                break;
            case 4:
                Menu.menu();
                break;
            default:
                System.out.println("Enter error,try again");
        }
    }
}
