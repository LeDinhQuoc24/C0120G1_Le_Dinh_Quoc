package CaseStudyversion2.controller;




import java.util.Scanner;

import static CaseStudyversion2.controller.AddService.addService;
import static CaseStudyversion2.controller.DisplayAllService.displayAllService;
import static CaseStudyversion2.controller.Exit.displayExit;

public class DisplayMenu {
    public static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1.Add New Services");
        System.out.println("2.Show Services");
        System.out.println("3.Add New Customer");
        System.out.println("4.Show Information of Customer");
        System.out.println("5.Add New Booking");
        System.out.println("6.Show Information of Employee");
        System.out.println("7.Save File");
        System.out.println("8.Load File");
        System.out.println("9.Exit");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                addService();
                break;
            case 2:
                displayAllService();
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Number 3-6:Don't finish,please select other number.");
                displayMenu();
                break;
            case 7:
                SaveAndLoadFile.saveFile();
                displayMenu();
            case 8:
                SaveAndLoadFile.loadFile();
                displayMenu();

            case 9:
            default:
                displayExit();
        }
    }
}
