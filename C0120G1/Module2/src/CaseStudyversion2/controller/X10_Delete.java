package CaseStudyversion2.controller;

import java.util.ArrayList;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.commons.SaveAndLoadBooking.loadBooking;
import static CaseStudyversion2.commons.SaveAndLoadBooking.saveBooking;
import static CaseStudyversion2.commons.SaveAndLoadEmployee.loadFileEmployee;
import static CaseStudyversion2.commons.SaveAndLoadEmployee.saveFileEmployee;
import static CaseStudyversion2.commons.SaveAndLoadHouse.loadFileHouse;
import static CaseStudyversion2.commons.SaveAndLoadHouse.saveFileHouse;
import static CaseStudyversion2.commons.SaveAndLoadInformationCustomer.loadInformationCustomer;
import static CaseStudyversion2.commons.SaveAndLoadInformationCustomer.saveInformationCustomer;
import static CaseStudyversion2.commons.SaveAndLoadRoom.loadFileRoom;
import static CaseStudyversion2.commons.SaveAndLoadRoom.saveFileRoom;
import static CaseStudyversion2.commons.SaveAndLoadVilla.loadFileVilla;
import static CaseStudyversion2.commons.SaveAndLoadVilla.saveFileVilla;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.controller.X2_DisplayAllService.*;
import static CaseStudyversion2.controller.X4_ShowInformationOfCustomer.showInformationOfCustomer;
import static CaseStudyversion2.controller.X6_ShowBookingCustomer.showBookingCustomer;
import static CaseStudyversion2.controller.X9_ShowInformationOfEmployee.showInformationOfEmployee;
import static CaseStudyversion2.views.MainRun.*;

public class X10_Delete {
    public static void deleteInformation() {
        System.out.println("Select Information you want to delete:\n"
        +"1.Villa\n"+"2.House\n"+"3.Room\n"+"4.Customer\n"+"5.Booking\n"+"6.Employee\n"+"7.Back to menu\n"
        );
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                deleteVilla();
                deleteInformation();
                break;
            case 2:
                deleteHouse();
                deleteInformation();
                break;
            case 3:
                deleteRoom();
                deleteInformation();
                break;
            case 4:
                deleteCustomer();
                deleteInformation();
                break;
            case 5:
                deleteBooking();
                deleteInformation();
                break;
            case 6:
                deleteEmployee();
                deleteInformation();
                break;
           case 7:
                displayMenu();
                break;
            default:
                System.out.println("Enter error,please try again");
                deleteInformation();
        }
    }
    public static void deleteVilla() {
        displayVilla();
        deleteListT(listVilla, "Villa", pathVilla);
    }
    public static void deleteHouse() {
        displayHouse();
        deleteListT(listHouse, "House", pathHouse);
    }
    public static void deleteRoom() {
        displayRoom();
        deleteListT(listRoom, "Room", pathRoom);
    }
    public static void deleteCustomer() {
        showInformationOfCustomer();
        deleteListT(listCustomer, "Customer", pathCustomer);
    }
    public static void deleteBooking() {
        showBookingCustomer();
        deleteListT(listCustomer, "Booking", pathBooking);
    }
    public static void deleteEmployee() {
        showInformationOfEmployee();
        deleteListT(listEmployee, "Employee", pathEmployee);
    }
    public static <T> void deleteListT(ArrayList<T> listT,String name,String path) {
        if (listT.size() == 0) {
            System.out.println(listT+"is null,please add Employee");
            displayMenu();
        } else {
            System.out.println("Select Information "+name+" to delete:");
            readFileX(path);
            int choice=Integer.parseInt(sc.nextLine());
            if (choice >= 1 && choice <= listT.size()) {
                listT.remove(listT.get(choice - 1));
            } else {
                System.out.println("Enter error,please try again");
                deleteBooking();
            }
            saveFileX(listT,path);
            System.out.println("Deleted");
        }
    }
}
