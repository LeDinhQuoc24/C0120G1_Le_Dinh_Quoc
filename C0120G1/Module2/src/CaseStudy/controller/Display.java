package CaseStudy.controller;

import CaseStudy.models.House;
import CaseStudy.models.Room;
import CaseStudy.models.Service;
import CaseStudy.models.Villa;
import CaseStudy.views.MainController;

import java.util.Scanner;

import static CaseStudy.controller.Exit.exit;
import static CaseStudy.controller.Menu.menu;


public class Display {
    public static void display() {
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
                for (Service service : MainController.ListService) {
                    System.out.println(service.showInfo());
                }
                display();
                break;
            case 2:
                for (Villa villa : MainController.ListVilla) {
                    System.out.println(villa.showInfo());
                }
                display();
                break;
            case 3:
                for (House house : MainController.ListHouse) {
                    System.out.println(house.showInfo());
                }
                display();
                break;
            case 4:
                for (Room room : MainController.ListRoom) {
                    System.out.println(room.showInfo());
                }
                display();
                break;
            case 5:
                for (Villa villa : MainController.ListVilla) {
                    System.out.println(villa.getNameService());
                }
                display();
                break;
            case 6:
                for (House house : MainController.ListHouse) {
                    System.out.println(house.getNameService());
                }
                display();
                break;
            case 7:
                for (Room room : MainController.ListRoom) {
                    System.out.println(room.getNameService());
                }
                display();
                break;
            case 8:
                menu();
                break;
            case 9:
                exit();
                break;
            default:
                System.out.println("Enter Error,please try again");
        }
    }
}
