package CaseStudyversion2.controller;




import java.util.Scanner;

import static CaseStudyversion2.controller.MenuAddService.addService;
import static CaseStudyversion2.controller.DisplayAllService.displayAllService;
import static CaseStudyversion2.controller.Exit.displayExit;

public class DisplayMenu {
    public static void displayMenu() {
        System.out.println("--------------------------------------\n");
        System.out.println("Menu\n"+"1.Add New Services\n"+
                "2.Show Services\n"+ "3.Add New Customer\n"+
                "4.Show Information of Customer\n"+ "5.Add New Booking\n"+
                "6.Show Information of Employee\n"+
                "7.Save File\n"+"8.Load File\n"+ "9.Exit\n"+
                "-------------------------------------------------");
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
