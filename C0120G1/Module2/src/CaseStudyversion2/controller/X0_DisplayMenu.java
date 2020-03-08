package CaseStudyversion2.controller;




import java.util.Scanner;

import static CaseStudyversion2.controller.X1_MenuAddService.addService;
import static CaseStudyversion2.controller.X3_AddNewCustomer.addNewCustomer;

import static CaseStudyversion2.controller.X2_DisplayAllService.displayAllService;
import static CaseStudyversion2.controller.X4_ShowInformationOfCustomer.showInformationOfCustomer;
import static CaseStudyversion2.controller.X5_AddNewBooking.addNewBooking;
import static CaseStudyversion2.controller.X6_ShowBookingCustomer.showBookingCustomer;
import static CaseStudyversion2.controller.X7_ShowInformationOfEmployee.showInformationOfEmployee;
import static CaseStudyversion2.controller.X10_Exit.displayExit;

public class X0_DisplayMenu {
    public static void displayMenu() {
        System.out.println("--------------------------------------\n");
        System.out.println("Menu\n"+"1.Add New Services\n"+
                "2.Show Services\n"+ "3.Add New Customer\n"+
                "4.Show Information of Customer\n"+ "5.Add New Booking\n"+
                "6.Show Booking Customer\n"+
                "7.Show Information of Employee\n"+
                "8.Save File\n"+"9.Load File\n"+ "10.Exit\n"+
                "-------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                addService();
                break;
            case 2:
                displayAllService();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                showInformationOfCustomer();
                break;
            case 5:
                addNewBooking();
                break;
            case 6:
                showBookingCustomer();
            case 7:
                showInformationOfEmployee();
                displayMenu();
                break;
            case 8:
                X8_9_SaveAndLoadFile.saveFile();
                displayMenu();
                break;
            case 9:
                X8_9_SaveAndLoadFile.loadFile();
                displayMenu();
                break;
            case 10:
                displayExit();
                break;
            default:
                System.out.println("Enter error,please try again");
                displayMenu();
        }
    }
}
