package CaseStudyversion2.controller;



import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Villa;

import java.util.Scanner;

import static CaseStudyversion2.controller.DisplayMenu.displayMenu;
import static CaseStudyversion2.controller.Exit.displayExit;
import static CaseStudyversion2.views.MainRun.*;


public class DisplayAllService {
    public static void displayAllService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Display All Service");
        System.out.println("2.Display All Villa");
        System.out.println("3.Display All House");
        System.out.println("4.Display All Room");
        System.out.println("5.Display All Name Villa Not Duplicate");
        System.out.println("6.Display All Name House Not Duplicate");
        System.out.println("7.Display All Name Name Not Duplicate");
        System.out.println("8.Back To Menu");
        System.out.println("9.Exit");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Villa:\n");
                for (Villa villa : listVilla) {
                    System.out.println(villa.showInfo());
                }
                System.out.println("House:\n");
                for (House house : listHouse) {
                    System.out.println(house.showInfo());
                }
                System.out.println("Room:\n");
                for (Room room : listRoom) {
                    System.out.println(room.showInfo());
                }
                displayAllService();
                break;
            case 2:
                for (Villa villa : listVilla) {
                    System.out.println(villa.showInfo());
                }
                displayAllService();
                break;
            case 3:
                for (House house : listHouse) {
                    System.out.println(house.showInfo());
                }
                displayAllService();
                break;
            case 4:
                for (Room room : listRoom) {
                    System.out.println(room.showInfo());
                }
                displayAllService();
                break;
            case 5:
                for (Villa villa : listVilla) {
                    System.out.println(villa.getNameService());
                }
                displayAllService();
                break;
            case 6:
                for (House house : listHouse) {
                    System.out.println(house.getNameService());
                }
                displayAllService();
                break;
            case 7:
                for (Room room : listRoom) {
                    System.out.println(room.getNameService());
                }
                displayAllService();
                break;
            case 8:
                displayMenu();
                break;
            case 9:
                displayExit();
                break;
            default:
                System.out.println("Enter Error,please try again");
        }
    }
}
