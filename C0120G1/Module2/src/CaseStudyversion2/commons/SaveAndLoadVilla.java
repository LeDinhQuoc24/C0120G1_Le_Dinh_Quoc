package CaseStudyversion2.commons;

import CaseStudyversion2.models.Villa;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.listVilla;

public class SaveAndLoadVilla {
    public static void saveFileVilla() {
        boolean check = saveFileX(listVilla,"D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveVilla.csv");
        if (check) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
     public static void loadFileVilla() {
         listVilla= readFileX("D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveVilla.csv");
    }
}
