package CaseStudyversion2.controller;



import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Villa;

import java.util.Scanner;

import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.controller.X9_Exit.displayExit;
import static CaseStudyversion2.views.MainRun.*;


public class X2_DisplayAllService {
    public static void displayAllService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------\n"+
                "1.Display All Service\n"+"2.Display All Villa\n"+
                "3.Display All House\n"+ "4.Display All Room\n"+
                "5.Display All Name Villa Not Duplicate\n"+
                "6.Display All Name House Not Duplicate\n"+
                "7.Display All Name Name Not Duplicate\n"+
                "8.Back To Menu\n"+ "9.Exit\n"+
                "----------------------------------------------------------");
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
                int n=1;
                for (Villa villa : listVilla) {
                    System.out.println("Villa-NameService"+n+": "+villa.getNameService());
                    n++;
                }
                displayAllService();
                break;
            case 6:
                int m=1;
                for (House house : listHouse) {
                    System.out.println("House-NameService"+m+": "+house.getNameService());
                    m++;
                }
                displayAllService();
                break;
            case 7:
                int k=1;
                for (Room room : listRoom) {
                    System.out.println("Room-NameService"+k+": "+room.getNameService());
                    k++;
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
