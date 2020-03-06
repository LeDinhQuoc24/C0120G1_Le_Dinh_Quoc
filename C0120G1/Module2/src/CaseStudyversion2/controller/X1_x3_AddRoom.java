package CaseStudyversion2.controller;




import CaseStudyversion2.models.Room;

import static CaseStudyversion2.commons.FuncValidationService.checkString;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.listRoom;


public class X1_x3_AddRoom {
    public static void addRoom() {
        Room room=new Room();
        X1_x0_AddService.addService(room);
        String regex = "^Jav1|Jav2|Jav3$";
        System.out.println("Enter FreeService:Jav1/Jav2/Jav3");
        room.setFreeService(checkString(regex,"FreeService failed"));
        listRoom.add(room);
        System.out.println("Add Room successfully");
        System.out.println(room.showInfo());
        displayMenu();

    }
}
