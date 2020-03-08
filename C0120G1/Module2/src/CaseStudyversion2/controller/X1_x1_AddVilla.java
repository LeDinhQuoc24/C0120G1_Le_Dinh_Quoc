package CaseStudyversion2.controller;



import CaseStudyversion2.commons.FuncValidation;
import CaseStudyversion2.models.Service;
import CaseStudyversion2.models.Villa;

import static CaseStudyversion2.commons.FuncValidation.checkNumberInteger;
import static CaseStudyversion2.commons.FuncValidation.checkString;
import static CaseStudyversion2.commons.SaveAndLoadVilla.loadFileVilla;
import static CaseStudyversion2.commons.SaveAndLoadVilla.saveFileVilla;
import static CaseStudyversion2.controller.X1_x0_AddService.addService;
import static CaseStudyversion2.views.MainRun.listVilla;


public class X1_x1_AddVilla {
    public static void addVilla() {
        Villa villa = new Villa();
        addService(villa);
        String regex = "(?i)(Diamond|Gold|Silver)";
        System.out.println("Enter RoomStandard:Diamond/Gold/Silver");
        villa.setRoomStandard(FuncValidation.checkString(regex,"Enter RoomStandard failed").toLowerCase());
        regex = "(?i)(Massage|Karaoke|Food|Drink|Car)";
        System.out.println("Enter OtherDescriptionOfUtilities:Massage/Karaoke/Food/Drink/Car");
        villa.setOtherDescriptionOfUtilities(checkString(regex,"Enter OtherDescriptionOfUtilities failed").toLowerCase());
        regex = "^[1-9]|([1][0-5])$";
        System.out.println("Enter NumberOfFloors:from 1 to 15");
        villa.setNumberOfFloors(checkNumberInteger(regex, "Enter NumberOfFloors failed"));
        regex = "^[2-4][0-9]|50$";
        System.out.println("Enter PoolArea:from 20 to 50");
        villa.setPoolArea(checkNumberInteger(regex, "Enter PoolArea failed"));
        System.out.println("Add Villa successfully");
        loadFileVilla();
        listVilla.add(villa);
        saveFileVilla();
        System.out.println(villa.showInfo());
    }
}
