package CaseStudyversion2.controller;

import CaseStudy.controller.Menu;
import CaseStudy.controller.RegisterHouse;
import CaseStudy.controller.RegisterRoom;
import CaseStudy.controller.RegisterVilla;

import java.util.Scanner;

import static CaseStudyversion2.controller.AddHouse.addHouse;
import static CaseStudyversion2.controller.AddRoom.addRoom;
import static CaseStudyversion2.controller.AddVilla.addVilla;
import static CaseStudyversion2.controller.DisplayMenu.displayMenu;

public class AddService {
    public static void addService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select type Register");
        System.out.println("1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to Menu");
        switch (sc.nextInt()) {
            case 1:
                addVilla();
                break;
            case 2:
                addHouse();
                break;
            case 3:
                addRoom();
                break;
            case 4:
                displayMenu();
                break;
            default:
                System.out.println("Enter error,try again");
                addService();
        }
    }
}
