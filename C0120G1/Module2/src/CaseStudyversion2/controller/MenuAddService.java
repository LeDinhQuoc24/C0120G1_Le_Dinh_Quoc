package CaseStudyversion2.controller;


import static CaseStudyversion2.controller.AddHouse.addHouse;
import static CaseStudyversion2.controller.AddRoom.addRoom;
import static CaseStudyversion2.controller.AddVilla.addVilla;
import static CaseStudyversion2.controller.DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.sc;

public class MenuAddService {
    public static void addService() {

        System.out.println("Select type Register\n"+ "1.Add New Villa\n"+
                "2.Add New House\n"+ "3.Add New Room\n"+ "4.Back to Menu");
        switch (sc.nextInt()) {
            case 1:
                addVilla();
                break;
            case 2:
                addHouse();
                break;
            case 3:
                addRoom();
                break;
            case 4:
                displayMenu();
                break;
            default:
                System.out.println("Enter error,try again");
                addService();
        }
    }
}
