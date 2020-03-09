package CaseStudyversion2.commons;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.listRoom;

public class SaveAndLoadRoom {
    public static void saveFileRoom() {
        boolean check = saveFileX(listRoom, "D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveRoom.csv");
        if (check) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
    public static void loadFileRoom() {
        listRoom= readFileX("D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveRoom.csv");
    }
}
