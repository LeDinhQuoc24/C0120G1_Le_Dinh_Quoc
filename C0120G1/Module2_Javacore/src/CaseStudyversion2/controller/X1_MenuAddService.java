package CaseStudyversion2.controller;


import static CaseStudyversion2.controller.X1_x2_AddHouse.addHouse;
import static CaseStudyversion2.controller.X1_x3_AddRoom.addRoom;
import static CaseStudyversion2.controller.X1_x1_AddVilla.addVilla;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.sc;

public class X1_MenuAddService {
    public static void addService() {

        System.out.println("Select type Register\n"+ "1.Add New Villa\n"+
                "2.Add New House\n"+ "3.Add New Room\n"+ "4.Back to Menu");
        switch (Integer.parseInt(sc.nextLine())) {
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
                break;
        }
    }
}
