package CaseStudyversion2.controller;



import CaseStudyversion2.models.Service;
import CaseStudyversion2.models.Villa;

import java.util.UUID;

import static CaseStudyversion2.commons.FuncValidation.checkNameService;
import static CaseStudyversion2.controller.DisplayMenu.displayMenu;

import static CaseStudyversion2.views.MainRun.listVilla;
import static CaseStudyversion2.views.MainRun.sc;


public class AddVilla {
    public static void addVilla() {
        Service villa = new Villa();
        AddService.addService(villa);
        System.out.println("Enter RoomStandard:3 stars,4 stars,5 stars");
        ((Villa)villa).setRoomStandard(sc.nextLine());
        System.out.println("Enter OtherDescriptionOfUtilities:Karaoke,Massage,Bowling");
        ((Villa)villa).setOtherDescriptionOfUtilities(sc.nextLine());
        System.out.println("Enter NumberOfFloors");
        ((Villa)villa).setNumberOfFloors(sc.nextInt());
        System.out.println("Enter PoolArea:20,50,100");
        ((Villa)villa).setPoolArea(sc.nextDouble());
        listVilla.add((Villa)villa);
        displayMenu();

    }
}
