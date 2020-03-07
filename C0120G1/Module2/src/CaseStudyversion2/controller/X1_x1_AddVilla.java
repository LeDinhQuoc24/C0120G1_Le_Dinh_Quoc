package CaseStudyversion2.controller;



import CaseStudyversion2.commons.FuncValidationService;
import CaseStudyversion2.models.Service;
import CaseStudyversion2.models.Villa;

import static CaseStudyversion2.commons.FuncValidationService.checkNumberInteger;
import static CaseStudyversion2.commons.FuncValidationService.checkString;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.listVilla;


public class X1_x1_AddVilla {
    public static void addVilla() {
        Service villa = new Villa();
        X1_x0_AddService.addService(villa);
        String regex = "^Diamond|Gold|Silver$";
        System.out.println("Enter RoomStandard:Diamond/Gold/Silver");
        ((Villa)villa).setRoomStandard(FuncValidationService.checkString(regex,"RoomStandard failed"));
        regex = "^Massage|Karaoke|Food|Drink|Car$";
        System.out.println("Enter OtherDescriptionOfUtilities:Massage/Karaoke/Food/Drink/Car");
        ((Villa)villa).setOtherDescriptionOfUtilities(checkString(regex,"OtherDescriptionOfUtilities failed"));
        regex = "^[1-9]|([1][0-5])$";
        System.out.println("Enter NumberOfFloors:from 1 to 15");
        ((Villa) villa).setNumberOfFloors(checkNumberInteger(regex, "NumberOfFloors failed"));
        regex = "^[2-4][0-9]|50$";
        System.out.println("Enter PoolArea:from 20 to 50");
        ((Villa)villa).setPoolArea(checkNumberInteger(regex, "PoolArea failed"));
        listVilla.add((Villa)villa);
        System.out.println("Add Villa successfully");
        System.out.println(villa.showInfo());
        displayMenu();
    }
}
