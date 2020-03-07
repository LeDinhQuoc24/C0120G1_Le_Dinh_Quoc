package CaseStudyversion2.controller;



import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Service;


import static CaseStudyversion2.commons.FuncValidation.checkNumberInteger;
import static CaseStudyversion2.commons.FuncValidation.checkString;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.controller.X1_x0_AddService.addService;
import static CaseStudyversion2.views.MainRun.*;

public class X1_x2_AddHouse {
    public static void addHouse() {
        Service house=new House();
        addService(house);
        System.out.println("Enter RoomStandard:Diamond/Gold/Silver");
        String regex = "^Diamond|Gold|Silver$";
        ((House)house).setRoomStandard(checkString(regex,"Enter RoomStandard failed"));
         regex = "^Massage|Karaoke|Food|Drink|[Car]$";
        System.out.println("Enter OtherDescriptionOfUtilities:Massage/Karaoke/Food/Drink/Car");
        ((House)house).setOtherDescriptionOfUtilities(checkString(regex,"Enter OtherDescriptionOfUtilities failed"));
         regex = "^[1-9]|([1][0-5])$";
        System.out.println("Enter NumberOfFloors:from 1 to 15");
        ((House) house).setNumberOfFloors(checkNumberInteger(regex, "Enter NumberOfFloors failed"));
        listHouse.add((House)house);
        System.out.println("Add House successfully");
        System.out.println(house.showInfo());
        displayMenu();

    }
}
