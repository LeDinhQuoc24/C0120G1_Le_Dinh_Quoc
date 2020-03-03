package CaseStudy.Task1.controller;

import java.util.Scanner;

import static CaseStudy.Task1.controller.Menu.menu;
import static CaseStudy.Task1.controller.RegisterHouse.registerHouse;
import static CaseStudy.Task1.controller.RegisterRoom.registerRoom;
import static CaseStudy.Task1.controller.RegisterVilla.registerVilla;

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
                registerVilla();
                break;
            case 2:
                registerHouse();
                break;
            case 3:
                registerRoom();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.println("Enter error,try again");
        }
    }
}
