package CaseStudyversion2.controller;



import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Service;
import CaseStudyversion2.models.Villa;

import java.util.Scanner;
import java.util.UUID;


import static CaseStudyversion2.commons.FuncValidation.checkNameService;
import static CaseStudyversion2.controller.DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.*;

public class AddHouse {
    public static void addHouse() {
        Service house=new House();
        AddService.addService(house);
        System.out.println("Enter RoomStandard:3 stars,4 stars,5 stars");
        ((House)house).setRoomStandard(sc.nextLine());
        System.out.println("Enter OtherDescriptionOfUtilities:Karaoke,Massage,Bowling");
        ((House)house).setOtherDescriptionOfUtilities(sc.nextLine());
        System.out.println("Enter NumberOfFloors");
        ((House)house).setNumberOfFloors(sc.nextInt());
        listHouse.add((House)house);
        displayMenu();

    }
}
