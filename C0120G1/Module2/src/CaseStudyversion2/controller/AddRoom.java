package CaseStudyversion2.controller;



import CaseStudyversion2.models.Room;
import Demo.Tong_Quang_Tien.commons.Data.Libs.Add;

import java.util.Scanner;
import java.util.UUID;

import static CaseStudyversion2.commons.FuncValidation.checkNameService;
import static CaseStudyversion2.controller.DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.listRoom;
import static CaseStudyversion2.views.MainRun.sc;

public class AddRoom {
    public static void addRoom() {
        Room room=new Room();
        AddService.addService(room);
        System.out.println("Enter FreeService:Jav1,Jav2,Jav3");
        room.setFreeService(sc.nextLine());
        listRoom.add(room);
        displayMenu();

    }
}
