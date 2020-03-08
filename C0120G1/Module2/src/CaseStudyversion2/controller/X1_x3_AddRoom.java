package CaseStudyversion2.controller;




import CaseStudyversion2.models.Room;

import static CaseStudyversion2.commons.FuncValidation.checkString;
import static CaseStudyversion2.commons.SaveAndLoadRoom.saveFileRoom;
import static CaseStudyversion2.controller.X1_x0_AddService.addService;
import static CaseStudyversion2.views.MainRun.listRoom;


public class X1_x3_AddRoom {
    public static void addRoom() {
        Room room=new Room();
        addService(room);
        String regex = "^Jav1|Jav2|Jav3$";
        System.out.println("Enter FreeService:Jav1/Jav2/Jav3");
        room.setFreeService(checkString(regex,"Enter FreeService failed"));
        listRoom.add(room);
        System.out.println("Add Room successfully");
        System.out.println(room.showInfo());
        saveFileRoom();
    }
}
