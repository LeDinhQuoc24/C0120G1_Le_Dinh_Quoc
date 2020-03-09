package CaseStudyversion2.controller;

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
                deleteBooKing();
                deleteInformation();
                break;
            case 6:
                deleteEmployee();
                deleteInformation();
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
        System.out.println("Select Information Villa to delete:");
        loadFileVilla();
        int choice=Integer.parseInt(sc.nextLine());
        if (choice >= 1 && choice <= listVilla.size()) {
            listVilla.remove(listVilla.get(choice - 1));
        } else {
            System.out.println("Enter error,please try again");
            deleteBooKing();
        }
        saveFileVilla();
        System.out.println("Deleted");
    }
    public static void deleteHouse() {
        displayHouse();
        System.out.println("Select Information House to delete:");
        loadFileHouse();
        int choice=Integer.parseInt(sc.nextLine());
        if (choice >= 1 && choice <= listHouse.size()) {
            listHouse.remove(listHouse.get(choice - 1));
        } else {
            System.out.println("Enter error,please try again");
            deleteBooKing();
        }
        saveFileHouse();
        System.out.println("Deleted");
    }
    public static void deleteRoom() {
        displayRoom();
        System.out.println("Select Information Room to delete:");
        loadFileRoom();
        int choice=Integer.parseInt(sc.nextLine());
        if (choice >= 1 && choice <= listRoom.size()) {
            listRoom.remove(listRoom.get(choice - 1));
        } else {
            System.out.println("Enter error,please try again");
            deleteBooKing();
        }
        saveFileRoom();
        System.out.println("Deleted");
    }
    public static void deleteCustomer() {
        showInformationOfCustomer();
        System.out.println("Select Information Customer to delete:");
        loadInformationCustomer();
        int choice=Integer.parseInt(sc.nextLine());
        if (choice >= 1 && choice <= listCustomer.size()) {
            listCustomer.remove(listCustomer.get(choice - 1));
        } else {
            System.out.println("Enter error,please try again");
            deleteBooKing();
        }
        saveInformationCustomer();
        System.out.println("Deleted");
    }
    public static void deleteBooKing() {
        showBookingCustomer();
        System.out.println("Select Information Booking to delete:");
        loadBooking();
        int choice=Integer.parseInt(sc.nextLine());
        if (choice >= 1 && choice <= listBooking.size()) {
            listBooking.remove(listBooking.get(choice - 1));
        } else {
            System.out.println("Enter error,please try again");
            deleteBooKing();
        }
        saveBooking();
        System.out.println("Deleted");
    }
    public static void deleteEmployee() {
        showInformationOfEmployee();
        System.out.println("Select Information Employee to delete:");
        loadFileEmployee();
        int choice=Integer.parseInt(sc.nextLine());
        if (choice >= 1 && choice <= listEmployee.size()) {
            listEmployee.remove(listEmployee.get(choice - 1));
        } else {
            System.out.println("Enter error,please try again");
            deleteBooKing();
        }
        saveFileEmployee();
        System.out.println("Deleted");
    }
}
