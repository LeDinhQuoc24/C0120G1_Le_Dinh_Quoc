package CaseStudyversion2.controller;




import CaseStudyversion2.models.Room;

import java.util.Scanner;

import static CaseStudyversion2.commons.FuncValidation.checkString;
import static CaseStudyversion2.controller.DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.listRoom;


public class AddRoom {
    public static void addRoom() {
        Room room=new Room();
        AddService.addService(room);
        String regex = "^Jav1|Jav2|Jav3$";
        System.out.println("Enter FreeService:Jav1/Jav2/Jav3");
        room.setFreeService(checkString(regex,"FreeService failed"));
        listRoom.add(room);
        displayMenu();

    }
}
