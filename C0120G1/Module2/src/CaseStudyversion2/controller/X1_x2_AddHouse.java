package CaseStudyversion2.controller;



import CaseStudyversion2.models.House;



import static CaseStudyversion2.commons.FuncValidation.checkNumberInteger;
import static CaseStudyversion2.commons.FuncValidation.checkString;
import static CaseStudyversion2.commons.SaveAndLoad.loadFileHouse;
import static CaseStudyversion2.commons.SaveAndLoad.saveFileHouse;
import static CaseStudyversion2.controller.X1_x0_AddService.addService;
import static CaseStudyversion2.views.MainRun.*;

public class X1_x2_AddHouse {
    public static void addHouse() {
        House house=new House();
        addService(house);
        System.out.println("Enter RoomStandard:Diamond/Gold/Silver");
        String regex = "(?i)(Diamond|Gold|Silver)";
        house.setRoomStandard(checkString(regex,"Enter RoomStandard failed").toLowerCase());
         regex = "(?i)(Massage|Karaoke|Food|Drink|Car)";
        System.out.println("Enter OtherDescriptionOfUtilities:Massage/Karaoke/Food/Drink/Car");
        house.setOtherDescriptionOfUtilities(checkString(regex,"Enter OtherDescriptionOfUtilities failed").toLowerCase());
         regex = "^[1-9]|([1][0-5])$";
        System.out.println("Enter NumberOfFloors:from 1 to 15");
        house.setNumberOfFloors(checkNumberInteger(regex, "Enter NumberOfFloors failed"));
        System.out.println("Add House successfully");
        loadFileHouse();
        listHouse.add(house);
        saveFileHouse();
        System.out.println(house.showInfo());
    }
}
