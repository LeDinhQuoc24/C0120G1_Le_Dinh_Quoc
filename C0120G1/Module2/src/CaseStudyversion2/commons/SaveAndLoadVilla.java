package CaseStudyversion2.commons;

import CaseStudyversion2.models.Villa;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.listVilla;
import static CaseStudyversion2.views.MainRun.pathVilla;

public class SaveAndLoadVilla {
    public static void saveFileVilla() {
        boolean check = saveFileX(listVilla,pathVilla);
        if (check) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
     public static void loadFileVilla() {
         listVilla= readFileX(pathVilla);
    }
}
