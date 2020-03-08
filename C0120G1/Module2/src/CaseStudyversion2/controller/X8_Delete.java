package CaseStudyversion2.controller;

import static CaseStudyversion2.commons.SaveAndLoadBooking.loadBooking;
import static CaseStudyversion2.commons.SaveAndLoadBooking.saveBooking;
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
import static CaseStudyversion2.views.MainRun.*;

public class X8_Delete {
    public static void deleteInformation() {
        System.out.println("Select Information you want to delete:\n"
        +"1.Villa\n"+"2.House\n"+"3.Room\n"+"4.Customer\n"+"5.Booking\n"+"6.Back to menu\n");
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                displayVilla();
                System.out.println("Select Information Villa to delete:");
                loadFileVilla();
                listVilla.remove(listVilla.get(Integer.parseInt(sc.nextLine()) - 1));
                saveFileVilla();
                System.out.println("Deleted");
                deleteInformation();
                break;
            case 2:
                displayHouse();
                System.out.println("Select Information House to delete:");
                loadFileHouse();
                listHouse.remove(listHouse.get(Integer.parseInt(sc.nextLine()) - 1));
                saveFileHouse();
                System.out.println("Deleted");
                deleteInformation();
                break;
            case 3:
                displayRoom();
                System.out.println("Select Information Room to delete:");
                loadFileRoom();
                listRoom.remove(listRoom.get(Integer.parseInt(sc.nextLine()) - 1));
                saveFileRoom();
                System.out.println("Deleted");
                deleteInformation();
                break;
            case 4:
                showInformationOfCustomer();
                System.out.println("Select Information Customer to delete:");
                loadInformationCustomer();
                listCustomer.remove(listCustomer.get(Integer.parseInt(sc.nextLine()) - 1));
                saveInformationCustomer();
                System.out.println("Deleted");
                deleteInformation();
                break;
            case 5:
                showBookingCustomer();
                System.out.println("Select Information Booking to delete:");
                loadBooking();
                listBooking.remove(listBooking.get(Integer.parseInt(sc.nextLine()) - 1));
                saveBooking();
                System.out.println("Deleted");
                deleteInformation();
                break;
            case 6:
                displayMenu();
                break;
            default:
                System.out.println("Enter error,please try again");
                deleteInformation();
        }
    }
}
