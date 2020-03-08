package CaseStudyversion2.controller;



import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Villa;

import java.util.Scanner;

import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.controller.X10_Exit.displayExit;
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
                System.out.println("******** Information List Service ***********\n\n");
                System.out.println("Villa:\n");
                for (Villa villa : listVilla) {
                    System.out.println(villa.showInfo()+"\n");
                }
                System.out.println("\n\n");
                System.out.println("House:\n");
                for (House house : listHouse) {
                    System.out.println(house.showInfo()+"\n");
                }
                System.out.println("\n\n");
                System.out.println("Room:\n");
                for (Room room : listRoom) {
                    System.out.println(room.showInfo()+"\n");
                }
                System.out.println("\n\n");
                displayAllService();
                break;
            case 2:
                System.out.println("******** Information List Villa **************\n");
                for (Villa villa : listVilla) {
                    System.out.println(villa.showInfo()+"\n");
                }
                displayAllService();
                break;
            case 3:
                System.out.println("******** Information List House **************\n");
                for (House house : listHouse) {
                    System.out.println(house.showInfo()+"\n");
                }
                displayAllService();
                break;
            case 4:
                System.out.println("******** Information List Room **************\n");
                for (Room room : listRoom) {
                    System.out.println(room.showInfo()+"\n");
                }
                displayAllService();
                break;
            case 5:
                System.out.println("********List NameVilla *******\n");
                int n=1;
                for (Villa villa : listVilla) {
                    System.out.println("NameVilla"+n+": "+villa.getNameService());
                    n++;
                }
                displayAllService();
                break;
            case 6:
                System.out.println("********List NameHouse*******\n");
                int m=1;
                for (House house : listHouse) {
                    System.out.println("NameHouse"+m+": "+house.getNameService());
                    m++;
                }
                displayAllService();
                break;
            case 7:
                System.out.println("********List NameRoom *******\n");
                int k=1;
                for (Room room : listRoom) {
                    System.out.println("NameRoom"+k+": "+room.getNameService());
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
                System.out.println("Enter error,please try again");
                displayAllService();
        }
    }
}
