package CaseStudyversion2.controller;




import java.util.Scanner;

import static CaseStudyversion2.controller.X11_Service_Film4D.serviceFilm4D;
import static CaseStudyversion2.controller.X1_MenuAddService.addService;
import static CaseStudyversion2.controller.X3_AddNewCustomer.addNewCustomer;

import static CaseStudyversion2.controller.X2_DisplayAllService.displayAllService;
import static CaseStudyversion2.controller.X4_ShowInformationOfCustomer.showInformationOfCustomer;
import static CaseStudyversion2.controller.X5_AddNewBooking.addNewBooking;
import static CaseStudyversion2.controller.X6_ShowBookingCustomer.showBookingCustomer;
import static CaseStudyversion2.controller.X7_AddNewEmployee.addNewEmployee;
import static CaseStudyversion2.controller.X8_FindEmployeeById.findEmployeeById;
import static CaseStudyversion2.controller.X10_Delete.deleteInformation;
import static CaseStudyversion2.controller.X12_Exit.displayExit;
import static CaseStudyversion2.controller.X9_ShowInformationOfEmployee.showInformationOfEmployee;

public class X0_DisplayMenu {
    public static void displayMenu() {
        while (true) {
            try {
                System.out.println("--------------------------------------\n");
                System.out.println("Menu\n"+"1.Add New Services\n"+
                        "2.Show Services\n"+ "3.Add New Customer\n"+
                        "4.Show Information of Customer\n"+ "5.Add New Booking\n"+
                        "6.Show Booking Customer\n"+"7.Add New Employee\n"+"8.Find Employee By ID\n"+
                        "9.Show Information of Employee\n"+
                        "10.Delete\n"+"11.Service Cinema4D\n"+ "12.Exit\n"+
                        "-------------------------------------------------");
                Scanner sc = new Scanner(System.in);
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        addService();
                        displayMenu();
                        break;
                    case 2:
                        displayAllService();
                        displayMenu();
                        break;
                    case 3:
                        addNewCustomer();
                        displayMenu();
                        break;
                    case 4:
                        showInformationOfCustomer();
                        displayMenu();
                        break;
                    case 5:
                        addNewBooking();
                        displayMenu();
                        break;
                    case 6:
                        showBookingCustomer();
                        displayMenu();
                    case 7:
                        addNewEmployee();
                        displayMenu();
                    case 8:
                        findEmployeeById();
                        displayMenu();
                        break;
                    case 9:
                        showInformationOfEmployee();
                        displayMenu();
                        break;
                    case 10:
                        deleteInformation();
                        displayMenu();
                        break;
                    case 11:
                        serviceFilm4D();
                        displayMenu();
                    case 12:
                        displayExit();
                        break;
                    default:
                        System.out.println("Enter error,please try again");
                        displayMenu();
                }
            } catch (Exception  e) {
                System.out.println("Enter error,please try again");
            }
        }

    }
}
