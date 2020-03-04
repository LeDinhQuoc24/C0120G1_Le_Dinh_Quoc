package CaseStudy.controller;


import CaseStudy.commons.FuncWriteAndReadFileCSV;
import CaseStudy.models.Service;
import CaseStudy.views.MainController;

import java.util.ArrayList;

public class SaveAndLoadFile {
    public static void saveFile() {
        boolean check = FuncWriteAndReadFileCSV.saveFile(MainController.ListService, "D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudy\\dataX");
        if (check) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
    public static void loadFile() {
        ArrayList<Service> data = FuncWriteAndReadFileCSV.readFile("D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudy\\dataX");
        System.out.println(data);
    }
}
