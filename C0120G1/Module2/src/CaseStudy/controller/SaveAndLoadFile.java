package CaseStudy.controller;


import CaseStudy.commons.FuncWriteAndReadFileCSV;
import CaseStudy.models.House;
import CaseStudy.models.Room;
import CaseStudy.models.Service;
import CaseStudy.models.Villa;
import CaseStudy.views.MainController;

import java.util.ArrayList;

import static CaseStudy.views.MainController.ListHouse;
import static CaseStudy.views.MainController.ListService;

public class SaveAndLoadFile {
    public static void saveFile() {
        boolean check = FuncWriteAndReadFileCSV.saveFile(ListHouse, "F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudy\\data\\main1.csv");
        if (check) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
    public static void loadFile() {
         ListService= FuncWriteAndReadFileCSV.readFile("F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudy\\data\\main1.csv");
        System.out.println("Load file succesfully");
        System.out.println("Id\t\t\tNameService\tAreaUsed\tRentalCosts\tMaxNumberOfPeople\tTypeOfRent\tRoomStandard\tOtherDescriptionOfUtilities\tNumberOfFloors");
        for (House service : ListHouse) {
            if (service instanceof House) {

                System.out.println(service.showInfo());
            }

        }

    }
}
